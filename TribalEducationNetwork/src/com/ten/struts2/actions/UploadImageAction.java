package com.ten.struts2.actions;

import java.io.File;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.ten.beans.TenLearningObjectAnnotationsBean;
import com.ten.dao.implementation.DbAccessDaoImpl;
import com.ten.dao.interfaces.DbAccessDaoInterface;
import com.ten.triplestore.dao.implementation.VirtuosoAccessDaoImpl;
import com.ten.triplestore.dao.interfaces.TriplestoreAccessDaoInterface;
public class UploadImageAction extends ActionSupport{

	static Logger log = Logger.getLogger(UploadImageAction.class);
	
	private static final long serialVersionUID = 1L;
	private File file;
    private String contentType;
    private String fileName;
    private TenLearningObjectAnnotationsBean tenLearningObjectAnnotationsBean;
    boolean annotate;
        
    public void setUpload(File file) {
       this.file = file;
    }

	public File getUpload() {
		return file;
	}
	
    public void setUploadContentType(String contentType) {
       this.contentType = contentType;
    }

	public String getUploadContentType() {
		return contentType;
	}

    public void setUploadFileName(String filename) {
       this.fileName = filename;
    }

	public String getUploadFileName() {
		return fileName;
	}

	public TenLearningObjectAnnotationsBean getTenLearningObjectAnnotationsBean() {
		return tenLearningObjectAnnotationsBean;
	}

	public void setTenLearningObjectAnnotationsBean(
			TenLearningObjectAnnotationsBean tenLearningObjectAnnotationsBean) {
		this.tenLearningObjectAnnotationsBean = tenLearningObjectAnnotationsBean;
	}
	
	public boolean getAnnotate() {
		return annotate;
	}

	public void setAnnotate(boolean annotate) {
		this.annotate = annotate;
	}

	public String execute() throws Exception {
		//Get request method invoked
		HttpServletRequest request = ServletActionContext.getRequest();
		
		String method = request.getMethod();
		String result = ActionConstants.FORWARD_SHOWJSP;
		
		if(ActionConstants.METHOD_POST.equalsIgnoreCase(method)){
			try{
				//Insert image into Mysql database
				DbAccessDaoInterface dbAccessDaoInterface = new DbAccessDaoImpl();
				int imageId = dbAccessDaoInterface.saveImage(this.file,this.fileName, this.annotate);
				
				if(this.annotate){
					//Insert annotation data in Triplestore
					TriplestoreAccessDaoInterface tdbAccessDaoInterface = new VirtuosoAccessDaoImpl();
					tdbAccessDaoInterface.insertImage(this.tenLearningObjectAnnotationsBean, imageId);
				}
				
	           //File uploaded successfully
			   addActionMessage(ActionConstants.FILE_UPLOAD_SUCCESS_MSG);
	           result = ActionConstants.FORWARD_SUCCESS;
			}catch(Exception ex){
				log.error(ex);
				reset();				
				addActionError(ActionConstants.FILE_UPLOAD_ERROR_MSG);
				result = ActionConstants.FORWARD_INPUT;
			}           
		}else if(ActionConstants.METHOD_GET.equalsIgnoreCase(method)){	
			reset();
			result = ActionConstants.FORWARD_SHOWJSP;;
		}
		return result;
	}	
	
	public void reset(){
		this.annotate = false;
		this.contentType = "";
		this.fileName = "";
		this.file= null;
		tenLearningObjectAnnotationsBean = new TenLearningObjectAnnotationsBean();
	}
}

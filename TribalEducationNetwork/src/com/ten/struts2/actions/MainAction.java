package com.ten.struts2.actions;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class MainAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

    @Override
    public String execute() throws Exception {
         HttpServletRequest request = ServletActionContext.getRequest();
         String result = ActionConstants.FORWARD_ERROR;
         String user_name = request.getUserPrincipal().getName();
         
         //check if user is logged in
         if(user_name!= null && !"".equals(user_name.trim())){
        	result = ActionConstants.FORWARD_SUCCESS;
         }else{
        	 Exception ex = new Exception();
        	 throw ex;
         }
         return result;
    }
}

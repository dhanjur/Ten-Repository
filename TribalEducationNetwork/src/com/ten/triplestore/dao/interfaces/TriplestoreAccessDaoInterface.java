package com.ten.triplestore.dao.interfaces;

import com.ten.beans.TenLearningObjectAnnotationsBean;

public interface TriplestoreAccessDaoInterface {
	public void queryLearningObject(String learningObjectType) throws Exception;	
	
	// adding some comment to test out my first commit
	//Insert image annotations in triple store
	public boolean insertImage(TenLearningObjectAnnotationsBean tenLearningObjectAnnotationsBean, int imageId) throws Exception;
	
	//Insert video annotations in triple store
	public boolean insertVideo(TenLearningObjectAnnotationsBean tenLearningObjectAnnotationsBean, int videoId) throws Exception;
	
	//Insert audio annotations in triple store
	public boolean insertAudio(TenLearningObjectAnnotationsBean tenLearningObjectAnnotationsBean, int audioId) throws Exception;
	
	//Insert text annotations in triple store
	public boolean insertText(TenLearningObjectAnnotationsBean tenLearningObjectAnnotationsBean, int textId) throws Exception;
}

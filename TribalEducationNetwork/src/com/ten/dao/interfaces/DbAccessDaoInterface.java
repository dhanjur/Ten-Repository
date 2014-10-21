package com.ten.dao.interfaces;

import java.io.File;

public interface DbAccessDaoInterface {
	//Method to save image details to database
	public int saveImage(File file, String fileName, boolean annotated) throws Exception;
	
	//Method to save video to database
	public int saveVideo(File file, String fileName, boolean annotated) throws Exception;
	
	//Method to save audio to database
	public int saveAudio(File file, String fileName, boolean annotated) throws Exception;
	
	//Method to save text to database
	public int saveText(File file, String fileName, boolean annotated) throws Exception;
}

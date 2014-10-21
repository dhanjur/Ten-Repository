package com.ten.dao.implementation;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

import com.ten.dao.interfaces.DbAccessDaoInterface;

/**
 * @author Nita Karande
 * This class contains implementation method for access Relational database Mysql and functionality related to it
 */
public class DbAccessDaoImpl implements DbAccessDaoInterface{
	static Logger log = Logger.getLogger(DbAccessDaoImpl.class);
	
	@Override
	/**
	 * This method is invoked by uploadImageAction to store the image to database.
	 * Method returns an integer which is the primary key of the image stored in database.
	 * This image is related to its annotations stored in triple store through the image id primary key.
	 */
	public int saveImage(File file, String fileName, boolean annotated) throws Exception
	{
		String LOG_METHOD_NAME = "int saveImage(File, String, boolean)";
		log.debug(this.getClass() + DaoConstants.LOG_BEGIN + LOG_METHOD_NAME);
		
		// declare a connection by using Connection interface 
		Connection connection = null;

		// Declare prepare statement.
		CallableStatement callableStatement = null;
		
		// declare FileInputStream object to store binary stream of given image.
		FileInputStream fis = null;		
		int image_id = 0;		
		try {
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup(DaoConstants.DB_JNDI_LOOKUP_NAME);
			connection = ds.getConnection();
			
			String sql_call = DaoConstants.INSERT_IMAGE_PROCEDURE_CALL;
			callableStatement = connection.prepareCall(sql_call);
			fis = new FileInputStream(file);
			callableStatement.setBinaryStream(1, (InputStream)fis, (int)(file.length()));
			callableStatement.setString(2, fileName);
			callableStatement.setInt(3, annotated?1:0);
			callableStatement.registerOutParameter(4, java.sql.Types.INTEGER);
			 
			// execute store procedure
			callableStatement.executeUpdate();
			
			image_id = callableStatement.getInt(4);
			
		}catch (Exception ex) {
			// catch if found any exception during rum time.
			log.error(ex);
			throw ex;
		}finally{
			// close all the connections.
			connection.close();
			callableStatement.close();
			fis.close();
			log.debug(this.getClass() + DaoConstants.LOG_END + LOG_METHOD_NAME);
		}		
		return image_id;
	}

	@Override
	/**
	 * This method is invoked by uploadVideoAction to store the video to database.
	 * Method returns an integer which is the primary key of the video stored in database.
	 * This video is related to its annotations stored in triple store through the video id primary key.
	 */
	public int saveVideo(File file, String fileName, boolean annotated)
			throws Exception 
	{
		String LOG_METHOD_NAME = "int saveVideo(File, String, boolean)";
		log.debug(this.getClass() + DaoConstants.LOG_BEGIN + LOG_METHOD_NAME);
		
		// declare a connection by using Connection interface 
		Connection connection = null;

		// Declare prepare statement.
		CallableStatement callableStatement = null;
		
		// declare FileInputStream object to store binary stream of given image.
		FileInputStream fis = null;		
		int video_id = 0;
		
		try {
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup(DaoConstants.DB_JNDI_LOOKUP_NAME);
			connection = ds.getConnection();
			
			String sql_call = DaoConstants.INSERT_VIDEO_PROCEDURE_CALL;
			callableStatement = connection.prepareCall(sql_call);
			fis = new FileInputStream(file);
			callableStatement.setBinaryStream(1, (InputStream)fis, (int)(file.length()));
			callableStatement.setString(2, fileName);
			callableStatement.setInt(3, annotated?1:0);
			callableStatement.registerOutParameter(4, java.sql.Types.INTEGER);
			 
			// execute store procedure
			callableStatement.executeUpdate();
			
			video_id = callableStatement.getInt(4);			
		}catch (Exception ex) {
			// catch if found any exception during rum time.
			log.error(ex);
			throw ex;
		}finally {
			// close all the connections.
			connection.close();
			callableStatement.close();
			fis.close();
			log.debug(this.getClass() + DaoConstants.LOG_END + LOG_METHOD_NAME);
		}
		return video_id;
	}

	@Override
	/**
	 * This method is invoked by uploadAudioAction to store the audio to database.
	 * Method returns an integer which is the primary key of the audio stored in database.
	 * This audio is related to its annotations stored in triple store through the audio id primary key.
	 */
	public int saveAudio(File file, String fileName, boolean annotated)
			throws Exception 
	{
		String LOG_METHOD_NAME = "int saveAudio(File, String, boolean)";
		log.debug(this.getClass() + DaoConstants.LOG_BEGIN + LOG_METHOD_NAME);
		
		// declare a connection by using Connection interface 
		Connection connection = null;

		// Declare prepare statement.
		CallableStatement callableStatement = null;
		
		// declare FileInputStream object to store binary stream of given image.
		FileInputStream fis = null;		
		int audio_id = 0;
		
		try {
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup(DaoConstants.DB_JNDI_LOOKUP_NAME);
			connection = ds.getConnection();
			
			String sql_call = DaoConstants.INSERT_AUDIO_PROCEDURE_CALL;
			callableStatement = connection.prepareCall(sql_call);
			fis = new FileInputStream(file);
			callableStatement.setBinaryStream(1, (InputStream)fis, (int)(file.length()));
			callableStatement.setString(2, fileName);
			callableStatement.setInt(3, annotated?1:0);
			callableStatement.registerOutParameter(4, java.sql.Types.INTEGER);
			 
			// execute store procedure
			callableStatement.executeUpdate();
			
			audio_id = callableStatement.getInt(4);			
		}catch (Exception ex) {
			// catch if found any exception during rum time.
			log.error(ex);
			throw ex;
		}finally {
			// close all the connections.
			connection.close();
			callableStatement.close();
			fis.close();
			log.debug(this.getClass() + DaoConstants.LOG_END + LOG_METHOD_NAME);
		}
		return audio_id;
	}

	@Override
	/**
	 * This method is invoked by uploadTextAction to store the text to database.
	 * Method returns an integer which is the primary key of the text stored in database.
	 * This text is related to its annotations stored in triple store through the text id primary key.
	 */
	public int saveText(File file, String fileName, boolean annotated)
			throws Exception 
	{
		String LOG_METHOD_NAME = "int saveText(File, String, boolean)";
		log.debug(this.getClass() + DaoConstants.LOG_BEGIN + LOG_METHOD_NAME);
		
		// declare a connection by using Connection interface 
		Connection connection = null;

		// Declare prepare statement.
		CallableStatement callableStatement = null;
		
		// declare FileInputStream object to store binary stream of given image.
		FileInputStream fis = null;		
		int text_id = 0;
		
		try {
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup(DaoConstants.DB_JNDI_LOOKUP_NAME);
			connection = ds.getConnection();
			
			String sql_call = DaoConstants.INSERT_AUDIO_PROCEDURE_CALL;
			callableStatement = connection.prepareCall(sql_call);
			fis = new FileInputStream(file);
			callableStatement.setBinaryStream(1, (InputStream)fis, (int)(file.length()));
			callableStatement.setString(2, fileName);
			callableStatement.setInt(3, annotated?1:0);
			callableStatement.registerOutParameter(4, java.sql.Types.INTEGER);
			 
			// execute store procedure
			callableStatement.executeUpdate();
			
			text_id = callableStatement.getInt(4);			
		}catch (Exception ex) {
			// catch if found any exception during rum time.
			log.error(ex);
			throw ex;
		}finally {
			// close all the connections.
			connection.close();
			callableStatement.close();
			fis.close();
			log.debug(this.getClass() + DaoConstants.LOG_END + LOG_METHOD_NAME);
		}		
		return text_id;
	}		
}

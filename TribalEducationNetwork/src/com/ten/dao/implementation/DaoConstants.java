package com.ten.dao.implementation;

/**
 * @author Nita Karande
 * This class contains constants used in dao classes
 */
public interface DaoConstants {
	public static final String DB_JNDI_LOOKUP_NAME = "jdbc/TenDB";
	
	public static final String INSERT_IMAGE_PROCEDURE_CALL = "call INSERT_IMAGE(?,?,?,?)";
	
	public static final String INSERT_VIDEO_PROCEDURE_CALL = "call INSERT_VIDEO(?,?,?,?)";
	
	public static final String INSERT_AUDIO_PROCEDURE_CALL = "call INSERT_AUDIO?,?,?,?)";
	
	public static final String INSERT_TEXT_PROCEDURE_CALL = "call INSERT_TEXT(?,?,?,?)";
	
	public static final String LOG_BEGIN = " Begin ";
	
	public static final String LOG_END = " End ";
}
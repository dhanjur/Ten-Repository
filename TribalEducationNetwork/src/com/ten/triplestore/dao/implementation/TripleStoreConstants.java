package com.ten.triplestore.dao.implementation;

public interface TripleStoreConstants {
	
	public static final String VIRTUOSO_JNDI_LOOKUP_NAME = "jdbc/VirtuosoDB";
	
	//Begin - Subject
	public static final String URI_TEN_ONTOLOGY = "http://www.semanticweb.org/ten/ontologies/2014/8/TenOntology#";
	
	public static final String URI_DUBLIN_CORE = "http://purl.org/dc/elements/1.1/";	
	
	public static final String URI_FOAF = "http://xmlns.com/foaf/0.1/";	
	
	public static final String URI_RDF = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";	
	
	public static final String URI_RDFS = "http://www.w3.org/2000/01/rdf-schema#";
	
	public static final String URI_IMAGE = "http://www.semanticweb.org/ten/ontologies/2014/8/Image#";
	
	public static final String URI_TEXT = "http://www.semanticweb.org/ten/ontologies/2014/8/Text#";
	
	public static final String URI_AUDIO = "http://www.semanticweb.org/ten/ontologies/2014/8/Audio#";
	
	public static final String URI_VIDEO = "http://www.semanticweb.org/ten/ontologies/2014/8/Video#";
	
	public static final String URI_COURSE = "http://www.semanticweb.org/ten/ontologies/2014/8/Course#";
	
	public static final String URI_ECONTENT = "http://www.semanticweb.org/ten/ontologies/2014/8/Econtent#";
	
	public static final String URI_CHAPTER = "http://www.semanticweb.org/ten/ontologies/2014/8/Chapter#";
	
	public static final String URI_ATOM = "http://www.semanticweb.org/ten/ontologies/2014/8/Atom#";
	//Begin - Subject
	
	//BEGIN - predicates
	public static final String URI_PREDICATE_RDF_TYPE = URI_RDF + "type";
	
	//DC - Descriptive
	public static final String URI_PREDICATE_DC_TITLE = URI_DUBLIN_CORE + "title";
	
	public static final String URI_PREDICATE_DC_SUBJECT = URI_DUBLIN_CORE + "subject";
	
	public static final String URI_PREDICATE_DC_DESCRIPTION = URI_DUBLIN_CORE + "description";	
	
	public static final String URI_PREDICATE_DC_SOURCE = URI_DUBLIN_CORE + "source";	
	
	public static final String URI_PREDICATE_DC_LANGUAGE = URI_DUBLIN_CORE + "language";
	
	public static final String URI_PREDICATE_DC_RELATION = URI_DUBLIN_CORE + "relation";
	
	public static final String URI_PREDICATE_DC_COVERAGE = URI_DUBLIN_CORE + "coverage";
	
	//DC - Administrative
	public static final String URI_PREDICATE_DC_CREATOR = URI_DUBLIN_CORE + "creator";
	
	public static final String URI_PREDICATE_DC_PUBLISHER = URI_DUBLIN_CORE + "publisher";
	
	public static final String URI_PREDICATE_DC_CONTRIBUTOR = URI_DUBLIN_CORE + "contributor";
	
	public static final String URI_PREDICATE_DC_RIGHTS = URI_DUBLIN_CORE + "rights";
	
	//DC - Structural
	public static final String URI_PREDICATE_DC_DATE = URI_DUBLIN_CORE + "date";
	
	public static final String URI_PREDICATE_DC_TYPE = URI_DUBLIN_CORE + "type";
	
	public static final String URI_PREDICATE_DC_FORMAT = URI_DUBLIN_CORE + "format";
	
	public static final String URI_PREDICATE_DC_IDENTIFIER = URI_DUBLIN_CORE + "identifier";
	
	//TEN common
	public static final String URI_PREDICATE_TEN_COMMON_MODIFIED = URI_TEN_ONTOLOGY + "modified";
	
	public static final String URI_PREDICATE_TEN_COMMON_RIGHTS_HOLDER = URI_TEN_ONTOLOGY + "rightsHolder";
	
	public static final String URI_PREDICATE_TEN_COMMON_ISPARTOF = URI_TEN_ONTOLOGY + "isPartOf";
	
	public static final String URI_PREDICATE_TEN_COMMON_HASPART = URI_TEN_ONTOLOGY + "hasPart";
	
	//TEN learning object (LO)
	public static final String URI_PREDICATE_TEN_LO_TRIBE = URI_TEN_ONTOLOGY + "tribe";
	
	public static final String URI_PREDICATE_TEN_LO_CATEGORY = URI_TEN_ONTOLOGY + "category";
	
	public static final String URI_PREDICATE_TEN_LO_TOPIC_THEME = URI_TEN_ONTOLOGY + "topicTheme";
	
	public static final String URI_PREDICATE_TEN_LO_SUBTPIC_THEME = URI_TEN_ONTOLOGY + "subTopicTheme";
	
	public static final String URI_PREDICATE_TEN_LO_RATING = URI_TEN_ONTOLOGY + "rating";
	//End - predicates
	
	//BEGIN - Object	
	public static final String URI_TEN_ONTOLOGY_IMAGE_OBJECT = URI_TEN_ONTOLOGY + "Image";
	
	public static final String URI_TEN_ONTOLOGY_VIDEO_OBJECT = URI_TEN_ONTOLOGY + "Video";
	
	public static final String URI_TEN_ONTOLOGY_AUDIO_OBJECT = URI_TEN_ONTOLOGY + "Audio";
	
	public static final String URI_TEN_ONTOLOGY_TEXT_OBJECT = URI_TEN_ONTOLOGY + "Text";	
	//End - Object 	
	
	public static final String PREFIX_TEN_ONTOLOGY = "prefix TenOntology: <" + URI_TEN_ONTOLOGY + "> . ";
	
	public static final String PREFIX_RDF = "prefix rdf: <" + URI_RDF + "> . ";
	
	public static final String PREFIX_RDFS = "prefix rdfs: <" + URI_RDFS + "> . ";
	
	public static final String PREFIX_FOAF = "prefix foaf: <" + URI_FOAF + "> . ";
	
	public static final String PREFIX_DUBLIN_CORE = "prefix dc: <" + URI_DUBLIN_CORE + "> . ";
	
	public static final String PREFIX_TEN_IMAGE = "prefix Image: <" + URI_IMAGE + "> . ";
	
	public static final String PREFIX_TEN_COURSE = "prefix Course: <" + URI_COURSE + "> . ";
	
	public static final String PREFIX_TEN_ECONTENT = "prefix Econtent: <" + URI_ECONTENT + "> . ";
	
	public static final String PREFIX_TEN_CHAPTER = "prefix Chapter: <" + URI_CHAPTER + "> . ";
	
	public static final String PREFIX_TEN_ATOM = "prefix Atom: <" + URI_ATOM + "> . ";
	
	public static final String PREFIX_TEN_TEXT = "prefix Text: <" + URI_TEXT + "> . ";	
	
	public static final String VIRTUOSO_GRAPH_URI = "http://localhost:8890/DAV/home/ten_user/graph";
	
	public static final String LOG_BEGIN = " Begin ";
	
	public static final String LOG_END = " End ";
	
	public static final String LOG_BEGIN_TRANSACTION = " Begin Transaction ";
	
	public static final String LOG_END_TRANSACTION = " End Transaction";

}

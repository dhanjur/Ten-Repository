package com.ten.beans;

public class TenLearningObjectAnnotationsBean extends TenCommonAnnoationsBean {
	String tribe;
	String category;
	String topicTheme;
	String subTopicTheme;
	String rating;	

	public String getTribe() {
		return tribe;
	}

	public void setTribe(String tribe) {
		this.tribe = tribe;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTopicTheme() {
		return topicTheme;
	}

	public void setTopicTheme(String topicTheme) {
		this.topicTheme = topicTheme;
	}

	public String getSubTopicTheme() {
		return subTopicTheme;
	}

	public void setSubTopicTheme(String subTopicTheme) {
		this.subTopicTheme = subTopicTheme;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public TenLearningObjectAnnotationsBean(){
		super();
		tribe = "";
		category = "";
		topicTheme = "";
		subTopicTheme = "";
		rating = "";	
	}
}

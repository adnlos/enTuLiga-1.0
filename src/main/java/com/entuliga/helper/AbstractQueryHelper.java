package com.entuliga.helper;

import java.util.Map;

public abstract class AbstractQueryHelper {
	
	private Map<String, String> querys;

	public Map<String, String> getQuerys() {
		return querys;
	}
	public void setQuerys(Map<String, String> querys) {
		this.querys = querys;
	}
	public String getSqlQuery(String key){
		return querys.get(key);
	}
}

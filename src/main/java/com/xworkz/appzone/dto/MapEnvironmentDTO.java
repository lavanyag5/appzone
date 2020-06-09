package com.xworkz.appzone.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapEnvironmentDTO {

	public static final Logger logger = LoggerFactory.getLogger(MapEnvironmentDTO.class);

	private String appName;
	private String environment;
	private String alias;
	private String Url;
	private String type;
	private String decom;

	public MapEnvironmentDTO() {
		logger.info(this.getClass().getSimpleName()+"\t Created");
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDecom() {
		return decom;
	}

	public void setDecom(String decom) {
		this.decom = decom;
	}

	@Override
	public String toString() {
		return "MapEnvironmentDTO [appName=" + appName + ", environment=" + environment + ", alias=" + alias + ", Url="
				+ Url + ", type=" + type + ", decom=" + decom + "]";
	}
	
	

}

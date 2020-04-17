package com.example.awsdemolatest.demolatest;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configBean {

	
	@Value("${spring.datasource.url}")
	private String integrationDBurl;
	
	
	@Value("${spring.datasource.username}")
	private String integrationDBUserName;
	
	
	@Value("${spring.datasource.password}")
	private String integrationDBPassword;
	
	
	@Value("${spring.datasource.driver-class-name}")
	private String integrationDBDriverClass;



	@Bean(name = "datasource")
	public DataSource setupDataSource() throws ClassNotFoundException, IOException {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(integrationDBDriverClass);
		dataSource.setUsername(integrationDBUserName);
		dataSource.setPassword(integrationDBPassword);
		dataSource.setUrl(integrationDBurl);
	
		return dataSource;
	}
	
}

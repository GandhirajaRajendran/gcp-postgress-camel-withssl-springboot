package com.example.awsdemolatest.demolatest;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
@Component
public class Router extends RouteBuilder {

	@Override
	public void configure() throws Exception {
				
		from("timer://foo?fixedRate=true&period=60000")
		.bean(Beantosenddata.class,"sendingData")
		.log("hello gcp")
		.to("sql:{{sql.audit_insert}}?dataSource=datasource");
		
	}

}

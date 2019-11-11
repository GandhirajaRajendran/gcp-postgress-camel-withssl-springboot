package com.example.awsdemolatest.demolatest;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;
@Component
public class Beantosenddata {

	private int i=0;

	public void sendingData(Exchange ex) {
		
		ex.getIn().setHeader("Id", (int)(100.0 * Math.random()) );
		ex.getIn().setHeader("Message", "Hello"+i++ );
	}
}

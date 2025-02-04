package com.in28minutes.learn_spring_AOP.aopexample.business;

import java.util.Arrays;
import org.springframework.stereotype.Service;

import com.in28minutes.learn_spring_AOP.aopexample.data.DataService1;
@Service
public class BusinessService1 {
	
	private Object dataService1;

	public BusinessService1(DataService1 dataService1) {
		Object data;
		this.dataService1 = data;
	}
	
	public int calculateMax() {
		int[] data = ((DataService1) dataService1).retrieveData();
		return Arrays.stream(data).max().orElse(0);
	}

}

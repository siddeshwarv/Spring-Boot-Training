package com.siddeshwar.learnspringframework.enterprise.example.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.siddeshwar.learnspringframework.enterprise.example.bussiness.BussinessService;

@Component
public class MyWebController {
	@Autowired
	private BussinessService bussinessService;
	public long returnValueFromBussinessService() {
		return bussinessService.calculateSum();
	}
}


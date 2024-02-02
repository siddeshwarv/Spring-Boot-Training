package com.siddeshwar.learnspringframework.enterprise.example.bussiness;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.siddeshwar.learnspringframework.enterprise.example.service.DataService;

@Component
public class BussinessService{
	@Autowired
	private DataService dataService;
	public long calculateSum() {
		List<Integer> data = dataService.getData();
		return data.stream().reduce(Integer::sum).get();
	}
}

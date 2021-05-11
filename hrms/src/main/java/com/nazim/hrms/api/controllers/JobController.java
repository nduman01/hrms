package com.nazim.hrms.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nazim.hrms.business.abstracts.JobService;
import com.nazim.hrms.Entity.concretes.Job;

@RestController
@RequestMapping("api/jobs")
public class JobController {
	JobService jobService;

	@Autowired
	JobController(JobService jobService) {
		
		this.jobService = jobService;
	}
	
	@GetMapping("/getall")
	public List<Job> getAll(){
		return this.jobService.getAll();
		
	}

}

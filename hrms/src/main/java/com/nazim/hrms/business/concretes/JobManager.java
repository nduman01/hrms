package com.nazim.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nazim.hrms.Entity.concretes.Job;
import com.nazim.hrms.business.abstracts.JobService;
import com.nazim.hrms.dataAcces.abstracts.JobDao;

@Service
public class JobManager implements JobService {
	
	JobDao jobDao;
	
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}


	@Override
	public List<Job> getAll() {
		return this.jobDao.findAll();
	}
	

}

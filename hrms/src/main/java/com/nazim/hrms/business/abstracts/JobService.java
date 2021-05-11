package com.nazim.hrms.business.abstracts;

import java.util.List;
import com.nazim.hrms.Entity.concretes.Job;


public interface JobService {
	List<Job> getAll();

}

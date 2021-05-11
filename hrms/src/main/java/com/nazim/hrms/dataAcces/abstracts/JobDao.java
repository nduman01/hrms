package com.nazim.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nazim.hrms.Entity.concretes.Job;

public interface JobDao extends JpaRepository<Job, Integer> {

}

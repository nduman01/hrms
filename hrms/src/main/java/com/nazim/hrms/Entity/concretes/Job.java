package com.nazim.hrms.Entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_titles")
public class Job {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	public Job() {
		// TODO Auto-generated constructor stub
	}
	
	public Job(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
	
	
	

}

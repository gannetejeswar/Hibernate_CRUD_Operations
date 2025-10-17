package com.sample;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pid;
	private String pname;
	@ManyToMany
	private List<Developer> developer;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public List<Developer> getDeveloper() {
		return developer;
	}
	public void setDeveloper(List<Developer> developer) {
		this.developer = developer;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

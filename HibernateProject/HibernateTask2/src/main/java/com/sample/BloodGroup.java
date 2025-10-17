package com.sample;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BloodGroup {

	@Id
	private int bgid;
	private String bgname;
	public int getBgid() {
		return bgid;
	}
	public void setBgid(int bgid) {
		this.bgid = bgid;
	}
	public String getBgname() {
		return bgname;
	}
	public void setBgname(String bgname) {
		this.bgname = bgname;
	}
	public BloodGroup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BloodGroup(int bgid, String bgname) {
		super();
		this.bgid = bgid;
		this.bgname = bgname;
	}
	
	
}

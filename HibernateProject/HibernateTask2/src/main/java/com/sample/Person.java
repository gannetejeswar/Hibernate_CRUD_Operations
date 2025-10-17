package com.sample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity

public class Person {
@Id
private int pid;
private String pname;
@OneToOne
private BloodGroup bg;

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

public BloodGroup getBg() {
	return bg;
}

public void setBg(BloodGroup bg) {
	this.bg = bg;
}

public Person() {
	super();
	// TODO Auto-generated constructor stub
}

public Person(int pid, String pname, BloodGroup bg) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.bg = bg;
}


}

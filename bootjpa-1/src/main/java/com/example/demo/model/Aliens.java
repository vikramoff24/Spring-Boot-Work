package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Aliens {
	@Id
	private int aid;
	private String aname;
	private String Tech;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public void setTech(String tech) {
		this.Tech = Tech;
	}
	@Override
	public String toString() {
		return "Aliens [aid=" + aid + ", aname=" + aname + ", tech=" + Tech + "]";
	}
	}

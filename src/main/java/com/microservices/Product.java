package com.microservices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String pname;
	private int ram;
	private int screensize;
	private String cpu;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getScreensize() {
		return screensize;
	}
	public void setScreensize(int screensize) {
		this.screensize = screensize;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", ram=" + ram + ", screensize=" + screensize + ", cpu=" + cpu
				+ "]";
	}
	
}

package com.enviyo.health;

public class Health {
	String name="renne";
	Integer brkod=1234;
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getBrkod() {
		return brkod;
	}
	public void setBrkod(Integer brkod) {
		this.brkod = brkod;
	}
	@Override
	public String toString() {
		return "Health [name=" + name + ", brkod=" + brkod + ", getName()=" + getName() + ", getBrkod()=" + getBrkod()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	


}

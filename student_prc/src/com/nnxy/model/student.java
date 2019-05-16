package com.nnxy.model;

public class student {
	private int id;//id
	private int sex;//sex
	
	public student(int id, int sex) {
		super();
		this.id = id;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", sex=" + sex + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}

package com.example.rwl;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@Column(name="student_id")
	private Integer srudentId;
	
	@Column(name="student_name")
	private String name;

	public Integer getSrudentId() {
		return srudentId;
	}

	public void setSrudentId(Integer srudentId) {
		this.srudentId = srudentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [srudentId=" + srudentId + ", name=" + name + "]";
	}
	
}

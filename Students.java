package com.studentmanagmentsystem.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private int std;
	private String name;
	private double marks;
	private String gender;
	private int age;
	private long phno;
	private String address;
}

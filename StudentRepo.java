package com.studentmanagmentsystem.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.studentmanagmentsystem.module.Students;

public interface StudentRepo extends CrudRepository<Students, Integer> {

	@Query(value="select * from students where sid=?2",nativeQuery = true)
	Students fetch(String name,int sid);

	@Query (value="select * from students where name=?1",nativeQuery = true)
	Students fetchbyname(String name);

}

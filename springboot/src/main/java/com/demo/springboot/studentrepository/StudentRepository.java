package com.demo.springboot.studentrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springboot.studententity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}

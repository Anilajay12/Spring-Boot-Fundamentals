package com.demo.springdatajpademo.student;

import com.demo.springdatajpademo.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Anil Narlapally
 * @version JAVA 17
 * @since 5/12/2023
 */

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}

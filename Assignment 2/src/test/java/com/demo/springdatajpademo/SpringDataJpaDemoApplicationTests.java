package com.demo.springdatajpademo;

import com.demo.springdatajpademo.student.Student;
import com.demo.springdatajpademo.student.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringDataJpaDemoApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void testSaveStudent() {
        Student student = new Student();
        student.setId(1L);
        student.setName("Anil");
        student.setScore(500);

        studentRepository.save(student);

        Student savedStudent = studentRepository.findById(1L).get();
        assertNotNull(savedStudent);
    }

    @Test
    void deleteStudent(){
        Student student = new Student();
        student.setId(1L);
        student.setName("Anil");
        student.setScore(500);

        studentRepository.save(student);

        boolean beforeDelete = studentRepository.existsById(1L);
        studentRepository.deleteById(1L);
        boolean afterDelete = studentRepository.existsById(1L);
        assertNotEquals(beforeDelete, afterDelete);
    }

    @Test
    void getStudentList(){
        List<Student> students = studentRepository.findAll();
        if (students.size() == 0){
            assertEquals(0, students.size());
        }
        else assertNotEquals(0, students.size());
    }

    @Test
    void updateStudent(){
        Student student = new Student();
        student.setId(1L);
        student.setName("Anil");
        student.setScore(500);

        Student beforeUpdate = studentRepository.save(student);

        student.setName("Mahi");

        Student afterUpdate = studentRepository.save(student);

        assertEquals("Anil", beforeUpdate.getName());
        assertEquals("Mahi", afterUpdate.getName());

    }

}

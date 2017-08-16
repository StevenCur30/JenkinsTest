package com.gridsum.service;

import com.gridsum.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> findStudents();

    Student findStudentById(Integer id);

    void deleteStudentById(Integer id);

    void updateStudent(Student student);

    void addStudent(Student student);
}

package com.gridsum.service.impl;

import com.gridsum.mapper.StudentMapper;
import com.gridsum.pojo.Student;
import com.gridsum.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findStudents() {
        return studentMapper.findStudents();
    }

    @Override
    public Student findStudentById(Integer id) {
        return studentMapper.findStudentById(id);
    }

    @Override
    public void deleteStudentById(Integer id) {
        studentMapper.deleteStudentById(id);
    }

   /* @Override
    public void updateStudent(Student student) {
        studentMapper.updateStudent(student.getAge(),student.getName(),student.getGender(),student.getId());
    }*/

   public void updateStudent(Student student){
       studentMapper.updateStudent(student);
   }

    @Override
    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }

}

package com.gridsum.controller;

import com.gridsum.pojo.Student;
import com.gridsum.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@RestController
@Api(value = "StudentController",description = "学生信息接口")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(path = "/hello",method = RequestMethod.GET)
    @ApiIgnore
    public String helloWorld(){
        return "hello springboot";
    }

    @RequestMapping(path="/students",method = RequestMethod.GET)
    @ApiOperation(value="查询所有学生信息",notes = "hahahahah")
    public List<Student> findStudents(){
        List<Student> students = studentService.findStudents();
        return students;
    }

    @RequestMapping(path = "/student/{id}",method = RequestMethod.GET)
    @ApiOperation(value="根据id查询某个学生信息")
    public Student findStudentById(@PathVariable("id") Integer id){
        Student student = studentService.findStudentById(id);
        return student;
    }

    @RequestMapping(path = "/ustudent",method = RequestMethod.PUT)
    @ApiOperation(value="修改学生信息")
    public String updateStudent(Student student){
        try{
            studentService.updateStudent(student);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "failer";
        }
    }

    @RequestMapping(value = "/delstudent/{id}",method = RequestMethod.DELETE)
    @ApiOperation(value="删除所有学生信息")
    public String deleteStudentById(@PathVariable("id") Integer id){
        try{
            studentService.deleteStudentById(id);
            return "success";
        }catch(Exception e){
            e.printStackTrace();
            return "failer";
        }
    }

    @RequestMapping(path = "/astudent",method = RequestMethod.POST)
    @ApiOperation(value="添加学生信息")
    public String addStudent(Student student){
        try{
            studentService.addStudent(student);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "failer";
        }
    }

}

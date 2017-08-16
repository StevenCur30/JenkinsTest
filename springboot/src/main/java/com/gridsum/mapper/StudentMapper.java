package com.gridsum.mapper;

import com.gridsum.pojo.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface StudentMapper {

    @Select("select * from student")
     List<Student> findStudents();

    @Select("select * from student where id=#{id}")
    Student findStudentById(Integer id);

    /*@Update("update student set age=#{age},name=#{name},gender=#{gender} where id=#{id}")
    void updateStudent(@Param("age") Integer age, @Param("name") String name, @Param("gender") String gender, @Param("id") Integer id);*/

    @Update("update student set age=#{age},name=#{name},gender=#{gender} where id=#{id}")
    void updateStudent(Student student);

    @Delete("delete from student where id=#{id}")
    void deleteStudentById(Integer id);

    @Insert("insert into student(name,age,gender) values(#{name},#{age},#{gender})")
    void addStudent(Student student);
}

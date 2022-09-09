package com.example.spring_boot_task_withsecurity.serviceImple.service;

import com.example.spring_boot_task_withsecurity.entity.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(int id, Student student);

    void updateStudent(int id,Student student);

    List<Student> getAllStudents(int id);

    Student getStudentById(int id);

    void deleteStudentById(int id);

    void assignStudentToCourse(int studentId,int courseId);

    // List<Student> countOfStudents(int id);
}

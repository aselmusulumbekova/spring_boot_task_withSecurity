package com.example.spring_boot_task_withsecurity.serviceImple.service;

import com.example.spring_boot_task_withsecurity.entity.Course;

import java.util.List;

public interface CourseService {
    void saveCourse(int id, Course course);

    List<Course> getAllCourses(int id);

    Course getCourseById(int id);

    void updateCourse(Course course,int id);

    void deleteCourse(int id);
}

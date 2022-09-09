package com.example.spring_boot_task_withsecurity.repositoryImpl.repository;

import com.example.spring_boot_task_withsecurity.entity.Course;

import java.util.List;

public interface CourseRepository {

    void saveCourse(int id, Course course);

    List<Course> getAllCourses(int id);

    Course getCourseById(int id);

    void updateCourse(int id,Course course);

    void deleteCourse(int id);
}

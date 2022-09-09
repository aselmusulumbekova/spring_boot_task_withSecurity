package com.example.spring_boot_task_withsecurity.serviceImple;

import com.example.spring_boot_task_withsecurity.entity.Course;
import com.example.spring_boot_task_withsecurity.repositoryImpl.repository.CourseRepository;
import com.example.spring_boot_task_withsecurity.serviceImple.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class CourseServiceImpl implements CourseService {
    private final CourseRepository repository;

    @Autowired
    public CourseServiceImpl( CourseRepository repository) {
        this.repository = repository;
    }


    @Override
    public void saveCourse(int id, Course course) {
        repository.saveCourse(id,course);
    }

    @Override
    public List<Course> getAllCourses(int id) {
        return repository.getAllCourses(id);
    }

    @Override
    public Course getCourseById(int id) {
        return repository.getCourseById(id);
    }

    @Override
    public void updateCourse(Course course, int id) {
        repository.updateCourse(id, course);
    }


    @Override
    public void deleteCourse(int id) {
        repository.deleteCourse(id);
    }
}

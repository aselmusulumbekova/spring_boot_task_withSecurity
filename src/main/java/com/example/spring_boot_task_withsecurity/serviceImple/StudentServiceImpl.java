package com.example.spring_boot_task_withsecurity.serviceImple;

import com.example.spring_boot_task_withsecurity.entity.Student;
import com.example.spring_boot_task_withsecurity.repositoryImpl.repository.StudentRepository;
import com.example.spring_boot_task_withsecurity.serviceImple.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    @Autowired
    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }


    @Override
    public void saveStudent(int id, Student student) {
        repository.saveStudent(id, student);
    }

    @Override
    public void updateStudent(int id, Student student) {
        repository.updateStudent(id, student);
    }

    @Override
    public List<Student> getAllStudents(int id) {
        return repository.getAllStudents(id);
    }

    @Override
    public Student getStudentById(int id) {
        return repository.getStudentById(id);
    }

    @Override
    public void deleteStudentById(int id) {
        repository.deleteStudentById(id);
    }

    @Override
    public void assignStudentToCourse(int studentId, int courseId) {
        repository.assignStudentToCourse(studentId,courseId);
    }
}

package com.example.spring_boot_task_withsecurity.serviceImple;

import com.example.spring_boot_task_withsecurity.entity.Lesson;
import com.example.spring_boot_task_withsecurity.repositoryImpl.repository.LessonRepository;
import com.example.spring_boot_task_withsecurity.serviceImple.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class LessonServiceImpl implements LessonService {
    private final LessonRepository repository;

    @Autowired
    public LessonServiceImpl(LessonRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveLesson(int courseId, Lesson lesson) {
        repository.saveLesson(courseId, lesson);
    }

    @Override
    public void updateLesson(int id, Lesson lesson) {
        repository.updateLesson(id, lesson);
    }

    @Override
    public List<Lesson> getAllLessons(int id) {
        return repository.getAllLessons(id);
    }

    @Override
    public Lesson getLessonById(int id) {
        return repository.getLessonById(id);
    }

    @Override
    public void deleteLessonById(int id) {
        repository.deleteLessonById(id);
    }
}

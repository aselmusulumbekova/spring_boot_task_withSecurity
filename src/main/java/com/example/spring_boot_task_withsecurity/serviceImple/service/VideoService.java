package com.example.spring_boot_task_withsecurity.serviceImple.service;

import com.example.spring_boot_task_withsecurity.entity.Video;

import java.util.List;

public interface VideoService {
    void saveVideo(int lessId, Video video);

    void updateVideo(int id,Video video);

    Video getVideoById(int id);

    List<Video> getAllVideos(int id);

    void deleteVideoById(int id);
}

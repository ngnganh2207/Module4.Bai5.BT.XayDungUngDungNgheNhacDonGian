package com.codegym.service;

import com.codegym.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();
    void save(Music music);
    void delete(Long id);
    Music findById(Long id);
}

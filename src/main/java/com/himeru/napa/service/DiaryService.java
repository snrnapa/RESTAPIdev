package com.himeru.napa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.himeru.napa.entity.Diary;

public interface DiaryService extends JpaRepository<Diary, Integer> {


}

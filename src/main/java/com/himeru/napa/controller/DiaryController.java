package com.himeru.napa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.himeru.napa.entity.Diary;
import com.himeru.napa.service.DiaryService;

@RestController
public class DiaryController {
	
	@Autowired
	DiaryService diaryservice;

    @GetMapping("/diary")
    public List<Diary> Diary() {
    	
    	List<Diary> list = diaryservice.findAll();
    	return list;
    }
    
    @PostMapping("/diary")
    public List<Diary> Diary(
    	
    	@RequestBody List<Diary>  diarylist){
    	List<Diary> result = diaryservice.saveAll(diarylist);
    	return result;
    }

}
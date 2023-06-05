package com.himeru.napa.entity;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


//ubuntuではlombokが動かなかったため、以下のgetter,setterと競合しなかったが、windowsでは、lombokが動くため、競合してエラーとなっていた。
// @AllArgsConstructor
//@Table(name = "diaries")	//指定しないとテーブルはクラス名と同じdiary
@Entity
//@NoArgsConstructor
public class Diary {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String comment;
    @Column(name = "create_datetime", nullable = false)
    private LocalDateTime createDatetime;
    
    
    
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
    
    public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
    
    public LocalDateTime getCreateDatetime() {
		return createDatetime;
	}
	public void setCreateDatetime(LocalDateTime createDatetime) {
		this.createDatetime = createDatetime;
	}
}
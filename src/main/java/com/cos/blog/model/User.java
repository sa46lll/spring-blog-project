package com.cos.blog.model;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

@Entity // User 클래스가 MySQL 에 테이블이 생성된다.
public class User {

	@Id  //Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY ) //JPA에서 사용하는 넘버링 전략을 따라가지 않고, 프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
	private int id; //시퀀스, auto_increment
	
	@Column(nullable = false, length = 30)
	private String username; //아이디
	
	@Column(nullable = false, length = 100) //123456 => 해쉬 (비밀번호 암호화)
	private String password;
	
	@Column(nullable = false, length = 50)
	private String email;
	
	@ColumnDefault("'user'")
	private String role; // Enum을 쓰는게 좋다. -> 데이터의 도메인(범위)을 만들어줄 수 있다. // admin, user, manager 중 설정 가능
	
	@CreationTimestamp //시간이 자동 입력
	private Timestamp createDate;
	
	
}
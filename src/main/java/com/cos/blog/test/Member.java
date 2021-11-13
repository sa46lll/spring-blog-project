package com.cos.blog.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter
//@Setter
//@RequiredArgsConstructor //final 변수에 대한 constructor 생성해준다.'
@Data //Getter, Setter 생성
//@AllArgsConstructor
@NoArgsConstructor //Bean 생성해준다.
public class Member {
	// JAVA 에서 변수는 대부분 private로 선언해준다.
	private int id; // final: 받은 데이터의 값을 변경하지 못하도록 한다.
	private String username;
	private String password;
	private String email;
	
	@Builder //인자가 다른 함수를 자동생성해줌.
	public Member(int id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
}

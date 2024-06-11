package com.ham1142.dto;

public class MemberDto {
	private int member_num; // 회원 번호(기본키) - 작명이지만 가능하면 DB와 동일하게 작성
	private String member_name; // 회원 이름
	private String member_email; // 회원 이메일
	private String member_signuptime; // 회원 가입시간
	
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int member_num, String member_name, String member_email, String member_signuptime) {
		super();
		this.member_num = member_num;
		this.member_name = member_name;
		this.member_email = member_email;
		this.member_signuptime = member_signuptime;
	}

	public int getMember_num() {
		return member_num;
	}
	public void setMember_num(int member_num) {
		this.member_num = member_num;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public String getMember_signuptime() {
		return member_signuptime;
	}
	public void setMember_signuptime(String member_signuptime) {
		this.member_signuptime = member_signuptime;
	}
	
	
}

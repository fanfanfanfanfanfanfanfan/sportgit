package com.sport.domain;

import java.sql.Date;
import java.sql.Timestamp;

public class User {
	private int id;
	private String phone;
	private String userName;
	private String passWord;
	private String email;
	private int age;
	private String gender;
	private Date birthday;
	private String description;
	private String portrait;
	private Timestamp createTime;
	private Timestamp updateTime;
	private byte isDeleted;
	
	//Get and Set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPortrait() {
		return portrait;
	}
	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	public byte getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(byte isDeleted) {
		this.isDeleted = isDeleted;
	}
	//ToString
	@Override
	public String toString() {
		return "User [id=" + id + ", phone=" + phone + ", userName=" + userName + ", passWord=" + passWord + ", email="
				+ email + ", age=" + age + ", gender=" + gender + ", birthday=" + birthday + ", description="
				+ description + ", portrait=" + portrait + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", isDeleted=" + isDeleted + "]";
	}
	
	
}

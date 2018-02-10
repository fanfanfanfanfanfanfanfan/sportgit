package com.sport.domain;

import java.sql.Timestamp;

public class Message {
	private int id;
	private String logo;
	private String title;
	private String contents;
	private Timestamp createTime;
	private Timestamp updateTime;
	private byte isDeleted;
	private User user;

}

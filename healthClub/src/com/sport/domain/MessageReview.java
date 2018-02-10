package com.sport.domain;

import java.sql.Timestamp;
import java.util.List;

public class MessageReview {
	private int id;
	private String comment;
	private Timestamp createTime;
	private Timestamp updateTime;
	private byte isDeleted;
	private Message message;
	private List<User> userList;
	private MessageReview messageReview;

}

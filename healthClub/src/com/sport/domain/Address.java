package com.sport.domain;

import java.sql.Timestamp;

public class Address {
	private int id;
	private String receiverName;
	private String receiverPhone;
	private String address;
	private byte isDefault;
	private Timestamp createTime;
	private Timestamp updateTime;
	private byte isDeleted;
	private User user;

}

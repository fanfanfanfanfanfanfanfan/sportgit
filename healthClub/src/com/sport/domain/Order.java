package com.sport.domain;

import java.sql.Timestamp;

public class Order {
	private int id;
	private byte state;
	private Timestamp createTime;
	private Timestamp updateTime;
	private User user;
	private Address address;

}

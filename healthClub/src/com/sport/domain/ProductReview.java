package com.sport.domain;

import java.sql.Timestamp;

public class ProductReview {
	private int id;
	private String comment;
	private byte star;
	private Timestamp createTime;
	private Timestamp updateTime;
	private byte isDeleted;
	private Product product;
	private User user;
	private Order order;

}

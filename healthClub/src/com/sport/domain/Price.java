package com.sport.domain;

import java.sql.Timestamp;

public class Price {
	private int id;
	private Double originalPrice;
	private Double salePrice;
	private byte isSale;
	private Timestamp createTime;
	private Timestamp updateTime;
	private Product product;

}

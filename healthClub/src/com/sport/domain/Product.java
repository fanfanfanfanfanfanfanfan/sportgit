package com.sport.domain;

import java.sql.Timestamp;
import java.util.List;

public class Product {
	private int id;
	private String productName;
	private String description;
	private String brand;
	private String logo;
	private int sale;
	private int stock;
	private Timestamp createTime;
	private Timestamp updateTime;
	private byte isDeleted;
	private List<Type> typeList;
}

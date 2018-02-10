package com.sport.domain;

import java.sql.Timestamp;
import java.util.List;

public class Video {
	private int id;
	private String videoName;
	private String video;
	private Timestamp createTime;
	private Timestamp updateTime;
	private byte isDeleted;
	private List<Type> typeList;

}

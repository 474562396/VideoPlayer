package com.fsf.videoplayer.bean;

import cn.bmob.v3.BmobObject;

/**
 * 分类对象业务类
 * @author Administrator
 *
 */
public class Category extends BmobObject {
	private String categoryName; // 分类名称
	private int categoryPid; // 分类父ID

	public Category(String categoryName, int categoryPid) {
		super();
		this.categoryName = categoryName;
		this.categoryPid = categoryPid;
	}

	public Category() {
		super();
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getCategoryPid() {
		return categoryPid;
	}

	public void setCategoryPid(int categoryPid) {
		this.categoryPid = categoryPid;
	}

	@Override
	public String toString() {
		return "Category [categoryName=" + categoryName + ", categoryPid="
				+ categoryPid + "]";
	}

}

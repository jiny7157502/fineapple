package com.multi.fineapple.vo;

public class CategoryVO {
	private int categoryId;
	private String categoryName;
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	@Override
	public String toString() {
		return "CategoryVO [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}

}

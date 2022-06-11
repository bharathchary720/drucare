package com.example.demo;

public class Food {
	private String item;
	private String  taste;
	private String  prize;
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}


	public Food() {
		super();
	}
	public Food(String item, String taste, String prize) {
		super();
		this.item = item;
		this.taste = taste;
		this.prize = prize;
	}

}

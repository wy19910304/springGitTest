package com.lanou.bean;

public class Car {
	
	private String name;
	private Integer num;
	private String brand;
	
	public Car(String name, Integer num, String brand) {
		super();
		this.name = name;
		this.num = num;
		this.brand = brand;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//sajjkadshdjkhdui
	
	// toString鐨勪綔鐢�:
	// 褰撲娇鐢╫ut鐩存帴杈撳嚭瀵硅薄鏃�, 涓嶅啀杈撳嚭瀵硅薄鐨勫唴瀛樹俊鎭�.
	// 鑰屼細杈撳嚭toString鏂规硶鐨勮繑鍥炲��
	@Override
	public String toString() {
		return "Car [name=" + name + ", num=" + num + ", brand=" + brand + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

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
	
	// toString的作用:
	// 当使用out直接输出对象时, 不再输出对象的内存信息.
	// 而会输出toString方法的返回值
	@Override
	public String toString() {
		return "Car [name=" + name + ", num=" + num + ", brand=" + brand + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

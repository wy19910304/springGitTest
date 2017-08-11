package com.lanou.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarFactory {
	
	
	// 工厂方法: 返回一个或者多个对象
	public Car createCar() {
		
		Car car = new Car("zhaoliu", 44, "东风");
		
		return car;
	}
	
	public static Car createStaticCar() {
		Car car = new Car("卢顺", 38, "白龙马");
		return car;
	}
	
	
	// 1.创建一个学生类(Student), 包含属性:名字(string),学号(integer).创建方式:构造函数注入;
	// 2.创建一个教师类(Teacher), 包含属性:名字(string),工号(integer),学生(Student).创建方式:setter注入;
	// 3.创建一个教室类(Classroom).创建方式: 静态工厂.
	
	

}








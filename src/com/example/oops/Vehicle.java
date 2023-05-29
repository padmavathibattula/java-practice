package com.example.oops;

public class Vehicle {
public void drive() {
	System.out.println("Driving vehicle");
}
public void start() {
	System.out.println("The vehicle is start");
}
public void stop() {
	System.out.println("The vehicle is stop");
}
public static void main(String[] args) {
	BankEncapsulation obj = new BankEncapsulation();
	obj.setBankBalance(10000);
	System.out.println(obj.getBankBalance());
}
}

package com.example.exceptions;

public class JavaExceptionExample {
     public static void main(String[] args) {
    	 try {
    		 int data=100/0;
    	 }catch(ArithmeticException ae) {
    		 System.out.println(ae);
    	 }
    	 System.out.println("the rest of the program");
     }
}

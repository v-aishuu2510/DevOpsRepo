package com.nt.main;

import com.nt.service.ArithmeticOperations;

public class AppTest {

	public static void main(String[] args) 
	{
		ArithmeticOperations ar=new ArithmeticOperations();
		System.out.println("Sum: "+ar.sum(100, 200));
		System.out.println("-----------------------");
		System.out.println("Sub: "+ar.sub(300, 300));
		System.out.println("-----------------------");
		System.out.println("Mul: "+ar.mul(10, 11));//456 
	}

}

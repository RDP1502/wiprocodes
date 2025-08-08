package com.wipro.oop.test;

import com.wipro.oop.Human;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human man = new Human();
		man.setNumEye(2);
		man.setGender("Male");
		man.setName("Robo");
		System.out.println(man);
		man.see(2);
		

	}

}

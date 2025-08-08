package com.wipro.basic;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		enum Month{
			JANUARY,
			FEBRUARY,
			MARCH,
			APRIL,
			MAY,
			JUNE,
			JULY,
			AUGUST,
			SEPTEMBER,
			OCTOBER,
			NOVEMBER,
			DECEMBER
		}
		Month month = Month.FEBRUARY;
		if(month ==Month.FEBRUARY)
		{
			System.err.println("FEBRUARY");
		}
			
		
		}
	}

//enum Day {
//	SUN,
//	MON,
//	TUE,
//	WED,
//	THU,
//	FRI,
//	SAT
//}
//
////Day day=Day.Mon;
////if(day==Day.Mon)
////{
////	System.out.println("Monday");
////}
//
//for(Day d:Day.values())
//{
//	System.out.println(d);
//}


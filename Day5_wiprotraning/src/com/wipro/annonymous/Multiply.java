package com.wipro.annonymous;

//Ex3: Create a functional interface called Multiply  having a method called  intmultiply(int a, int b).
//Implement a lambda expression of this functional interface which  multiplies a with b and returns the result.
//Call the multiply method of the lambda expression.

@FunctionalInterface
public interface Multiply {
	int  intmultiply(int a, int b);

}

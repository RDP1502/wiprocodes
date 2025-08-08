package com.wipro.annonymous;

public class AnnonymousDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		
		BankOps savingAccount = new BankOps(){
			

			@Override
			public void deposit(double amount) {
				// TODO Auto-generated method stub
				
				System.out.println("Saving amount " + amount );
				
			}
		};
		savingAccount.deposit(44.55);
		

	}

}

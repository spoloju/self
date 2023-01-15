package exceptionHandling;

import java.util.Scanner;

public class UserDefinedExceptionsDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int availableBalance = 1000;
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please Enter Amount to withdraw");
		int requiredAmount = sc.nextInt();
		sc.close();
		try{
			if(requiredAmount>availableBalance){
				throw new InsufficientBalanceException();
			}else if(availableBalance-requiredAmount==0){
				throw new InsufficientBalanceException("Balance became 0");
			}	
		}catch(InsufficientBalanceException e){
			
			e.printStackTrace();
			
		}finally{
		
			System.out.println("Available Balance after transaction ==> " + availableBalance);
		}
		
		
		
	}

}

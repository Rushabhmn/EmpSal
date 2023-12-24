package Bridgelabz;


	import java.util.Random;
	import java.util.Scanner;
	public class EmpWage {
	    public static void main(String[] args) {
	    	  Random ram=new Random();
	    	 
	    	  int hr=20;
	    		int day=8;
	    		int parMouth=20;
	    		int sal=0;
	    		
	    		Scanner sc=new Scanner(System.in);
	    		 System.err.println("enter no 1 to 7");
	    		int a=sc.nextInt();
	    			
	    		   switch(a)
	    		   {
	    		   case 1:sal=hr*day;
	    			System.err.println("employ sal per day ="+sal );
	    		   break;
	    		   case 2:sal=hr*day;
	   			    System.err.println("employ partime sal per day ="+sal );
	    			   break;
	    		   case 3:
	    			  
	    			   break;
	    		   case 4:
	    			   int totalsal = 0;
	    			   int persal=160;
	    		        for (int i = 1; i <= parMouth; i++) {
	    		            totalsal =totalsal+ persal;
	    		        }
	    		        System.err.println(totalsal);
	    			 
	    			   break;
	    		   case 5:
	    			   int employ=ram.nextInt(2);
	    				  
	    				  if(employ==0)
	    				  {
	    				   System.err.println("ram");
	    				  }
	    				  else
	    				  {
	    					  System.out.println("sham");
	    				  }
	    			   break;
	    		   case 6:   
	    		        System.out.println("Welcome to Employee Wage Computation Program");

	    		        // UC 1
	    		        System.out.println("UC 1: Daily Wage - " + sal);

	    		        // UC 2
	    		        System.out.println("UC 2: Part-time Wage - " + sal);

	    		        // UC 3
	    		        System.out.println("UC 3: Wage using Switch - " + parMouth);

	    		        // UC 4
	    		        System.out.println("UC 4: Monthly Wage - " );

	    		        // UC 5
	    		        System.out.println("UC 5: Wage with condition - ");
	    			  
	    			   break;
	    		   case 7:
	    			 break;
	    			 default:
	    				
	    		   
	    		   }
	    		 
	    		}
	   
	    }


		




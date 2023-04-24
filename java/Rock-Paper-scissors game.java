import java.lang.Math;
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{   
	    char ans; 
	    Scanner sc=new Scanner (System.in);
	    do 
	    {
	    	System.out.println("Options:-\n 1)-Rock\t 2)-Paper\t 3)-Scissors\nEnter a number(1-3) : ");
	    	int n=sc.nextInt();
	    	int r=(int)(Math.random()*(3-1+1))+1;
	    	switch (n)
	    	{
	    	    case 1 : System.out.println("Your chosen option :- ROCK ");
	    	             if (r==1)
	    	              System.out.println("Computer generated option :- ROCK \n\t Result---<< NO WINNER,IT'S A TIE !!! >>");
	    	             if (r==2)
	    	              System.out.println("Computer generated option :- PAPER \n\t Result---<< COMPUTER HAS WON THE GAME !!! >>");
	    	             if (r==3)
	    	              System.out.println("Computer generated option :- SCISSORS \n\t Result---<< YOU HAVE WON THE GAME !!! >>");
	    	             break;
	    	    case 2 : System.out.println("Your chosen option :- PAPER ");
	    	             if (r==1)
	    	              System.out.println("Computer generated option :- ROCK \n\t Result---<< YOU HAVE WON THE GAME !!! >>");
	    	             if (r==2)
	    	              System.out.println("Computer generated option :- PAPER \n\t Result---<< NO WINNER,IT'S A TIE !!! >>");
	    	             if (r==3)
	    	              System.out.println("Computer generated option :- SCISSORS \n\t Result---<< COMPUTER HAS WON THE GAME !!! >>");
	    	             break;
	    	    case 3 : System.out.println("Your chosen option :- SCISSORS ");
	    	             if (r==1)
	    	              System.out.println("Computer generated option :- ROCK \n\t Result---<< COMPUTER HAS WON THE GAME !!! >>");
	    	             if (r==2)
	    	              System.out.println("Computer generated option :- PAPER \n\t Result---<< YOU HAVE WON THE GAME !!! >>");
	    	             if (r==3)
	    	              System.out.println("Computer generated option :- SCISSORS \n\t Result---<< NO WINNER,IT'S A TIE !!! >>");
	    	             break;
	    	    default : System.out.println("Wrong choice !!");
	        }
    	System.out.println("Want to play more(y/n) ?");
    	ans=sc.next().charAt(0);
    }while(ans=='y');
}}


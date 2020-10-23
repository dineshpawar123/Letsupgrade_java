
//----------------Question 1
/*

import java.lang.*;
import java.util.*;

 class Avenger{
	public String name;
	public int age;
	public String power;
	public String weapon;
	public String planet;
	Scanner sc=new Scanner(System.in);
	
public void	get_detail()
{
	System.out.println("enter name :");
	name=sc.nextLine();

	
	System.out.println("enter age :");
	age=sc.nextInt();
	sc.nextLine();
	
	System.out.println("enter power :");
	power=sc.nextLine();
	
	System.out.println("enter weapon :"); 
	weapon=sc.nextLine();
	
	System.out.println("enter planet :");
	planet=sc.nextLine();
}
	
public void display_detail()
{
   System.out.println("Name is :"+name);
   System.out.println("enter age is :"+age);
   System.out.println("enter power is :"+power);
   System.out.println("enter weapon  is:"+weapon);
   System.out.println("enter planet is:"+planet);
}

}

public class letsupgrade_assignment_day4{
	public static void main(String args[])
	{
	
	Avenger obj[]=new Avenger[2];
		for(int i=0;i<2;i++)
		{
			obj[i]=new Avenger();
			obj[i].get_detail();
			obj[i].display_detail();
		}
		for(int i=0;i<2;i++)
		{
			
			obj[i].display_detail();
		}
	}
}
*/

//--------Q2

/*
public class letsupgrade_assignment_day4{
	public static void main(String args[])
	{
	
	int brr[]=new int[5];
	brr[0]=3;
	brr[1]=4;
	brr[2]=1;
	brr[3]=4;
	brr[4]=5;
	
	
		for(int i=0;i<5;i++)
		{
			if((brr[i]%2)!=0)
			{
				System.out.println(brr[i]);
				
			}
			
			
		}
	}
}
*/

//-----Question3

import java.util.Scanner;

public class letsupgrade_assignment_day4{
	
	public static void main(String args[])
	{
		
	int isum=0;
		
	Scanner sc=new Scanner(System.in);
	
	int brr[]=new int[5];
	
	 for(int i=0;i<5;i++)
		{
		brr[i]=sc.nextInt();	
		isum=isum+brr[i];
		}
		
	 	System.out.println("addition is :"+isum);	
	
	}
}

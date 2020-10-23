//-----------------Question 1

/*
import java.lang.*;

 class Percentage{
	public  int Mark1,Mark2,Mark3,Mark4,Mark5;
	public float percentage;

	
public void display(int Mark1,int Mark2,int Mark3,int Mark4,int Mark5)
{
	float total=Mark1+Mark2+Mark3+Mark4+Mark5;
	System.out.println(total/500);
   percentage=((total/500)*100);
	System.out.println(percentage);
	
	
	if(percentage >80)
	{
		System.out.println("grade is A "+"percentage is"+" "+percentage);
	}
	else if(percentage >60)
	{
	System.out.println("grade is B "+" "+"percentage is"+" "+percentage);
	}
	else if(percentage >45)
	{
	System.out.println("grade is C "+"percentage is"+" "+percentage);
	}
	else if(percentage >35)
	{
	System.out.println("grade is D "+"percentage is"+" "+percentage);
	}
	else
	{
		System.out.println("fail");
	}
	
	}
}
public class letsupgrade_assignment_day3{
	public static void main(String args[])
	{

	Percentage obj=new Percentage();
	obj.display(90,90,90,90,90);
	obj.display(70,70,70,70,70);
	obj.display(50,50,50,50,70);
	obj.display(40,30,30,30,40);
	
	}
}

*/

//-------------------------Question2

import java.lang.*;

 class Employee{
	 
	public String name;
	public int date;
	public int month;
	public int year;
	public float salary;

	
public void display(String name,int d,int m,int y,int sal)
{  int yy=2020-y;
   
   int tax;
   
   if(sal>500000)
	 tax=(sal/100)*20;   
   
   else if(sal>400000)
    tax=(sal/100)*15;

   else if(sal>300000)
    tax=(sal/100)*10;

   else if(sal>200000)
    tax=(sal/100)*5;
   else
   {
	   tax=0;
   }

	System.out.println("name is  :"+name+" age is :"+yy+"annual salary :"+sal+"tax amount"+tax);
	
}

 }
public class letsupgrade_assignment_day3
{
	public static void main(String args[])
	{

	Employee obj=new Employee();
	obj.display("shree",27,4,1997,240000);
	
	
	}
}

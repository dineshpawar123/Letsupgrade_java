import java.lang.*;

 class Employee{
	public String name;
	public String city ;
	public int age;
	
public void display()
{
	System.out.println("Name is "+""+this.name);	
}

}

public class letsupgrade_assignment_day2{
	public static void main(String args[])
	{

	Employee obj=new Employee();
	obj.name="shree";
	obj.age=20;
	obj.city="pune";
	obj.display();
	
	}

}

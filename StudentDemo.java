import java.util.Scanner;

class Student {
	int rollno;
	String name;
	 Student()
	 {
		 this.rollno=rollno;
		 this.name=name;
	 }
	void setdata()
	{    Scanner sc=new Scanner(System.in);
		System.out.println ("Enter roll no. of Student");
	     rollno = sc.nextInt();
		  System.out.println ("Enter Name of Student");
		  name = sc.nextLine();
	}
	void showdata()
	{
		  System.out.println ("Roll No. = "+rollno);
		  System.out.println ("Name = "+name);
	}
	
}
public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student();  
		s.setdata();
		s.showdata();
		  
	}

}

import java.util.Scanner;
 
abstract class Processor {
	Processor() // default Constructor
	{
		System.out.println("Base class constructor called");
	}
    abstract void findFactorial(int s);
    abstract void findCircle(double r);
}
 
class process extends Processor {
	process()
	{
		super(); // calling Base class ctor
		System.out.println("Derived class constructor called");
	}
    void findFactorial(int s)
    {
    	 int i,fact=1;     
    	  for(i=1;i<=s;i++){    
    	      fact=fact*i;    
    	  }    
    	  System.out.println("Factorial of "+s+" is: "+fact);    
    	 }  
    	  
    void findCircle(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of Circle: "+area);
    }
}
         
class Que4 {
    public static void main(String args[])
    {
        process obj = new process();
        Scanner get = new Scanner(System.in);
        System.out.println("Choice 1. Factorial of Number");
        System.out.println("Choice 2. Area of Circle ");
        System.out.print("\nEnter Choice: ");
        int n = get.nextInt();
    switch(n)
    {
   
    case 1:
        System.out.print("\nFactorial of: ");
        int s = get.nextInt();
        obj.findFactorial(s);
        break;
    case 2:
        System.out.print("\nEnter Radius of Circle: ");
        double r = get.nextDouble();
        obj.findCircle(r);
        break;
    }
    }
}
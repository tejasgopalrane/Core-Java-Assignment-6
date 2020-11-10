import java.util.Scanner;
class Employee{
	int empId;
	int salary;
	int totalSalary;
	public Employee(int empId,int Sal)
	{
		this.empId=empId;
		this.salary = Sal;	
	}
	public void showDetail()
	{
		System.out.println("Employee ID is                  :: "+empId);
		System.out.println("Employee salary is              :: "+salary);
	}
	void totalEmp(Employee []e)
	{ 
		int totalEmployee=0;
		for(int i=0;i<e.length;i++)
		{
			totalEmployee=i+1;
		}
		System.out.println("Total Number of Employee's are  :: "+totalEmployee);
	}
	void totalSalary(Employee []e)
	{
		for(int i=0;i<e.length;i++)
		{
	    this.totalSalary+=salary;
		}
		System.out.println("Total Salary of Employee        :: "+totalSalary);
	}
}
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value for number of Employee information that you want to add..");
		int n=sc.nextInt();
		Employee []e= new Employee[n];
		
		
		for (int i=0;i<n;i++)
		{

			System.out.println("Enter the empID in contineous maner    :: ");
			int empId=sc.nextInt();
			System.out.println("Enter the salary of employee in ruyees :: ");
			int salary=sc.nextInt();
			e[i]=new Employee(empId,salary);
		}
		System.out.println();
	
		for (int i=0;i<n;i++)
		{
			e[0].showDetail();  
		}
		System.out.println();
		 e[0].totalEmp(e);
		e[0].totalSalary(e);
		
		sc.close();
		

		
		

	}

}
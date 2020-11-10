							//---------- 4 ---------//
import java.util.Scanner;
public class MathOperation {
	public void multiply(int i1, int i2)
	{
		System.out.println("Two integers Multiplication	:	"+i1*i2);
	}
	public void multiply(float f1,float f2,float f3)
	{
		System.out.println("Three float Multiplication	:	"+f1*f2*f3);
	}
	public void multiply(int i1,double d1)
	{
		System.out.println("One integer and one double Multiplication	:	"+i1*d1);
	}
	public void multiply(int[] arr)
	{    int temp=1;
			for(int i=0;i<arr.length;i++)
			{
				temp=temp*arr[i];
			}
		System.out.println("Array Multiplication	:	"+temp);
	}
	public static void main(String[] args) {
		MathOperation m=new MathOperation();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two integers	:	");
		int i1=sc.nextInt();
		int i2=sc.nextInt();
		m.multiply(i1, i2);
		
		System.out.println("Enter three Float	:	");
		float f1=sc.nextFloat();
		float f2=sc.nextFloat();
		float f3=sc.nextFloat();
		m.multiply(f1, f2, f3);
		
		System.out.println("Enter double	:	");
		double d1=sc.nextDouble();
		m.multiply(i1, d1);
		
		int arr[] = {1, 2, 3, 4, 5, 6};
		m.multiply(arr);
	}

}

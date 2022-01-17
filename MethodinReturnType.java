import java.util.Scanner;

public class MethodinReturnType {
	public  int compareNum()
{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=scan.nextInt();
		System.out.println("Enter the b value");
		int b=scan.nextInt();
		System.out.println("a="+a+"\nb="+b);
		if(a>b)
			return a;
		else
			return b;
		
		
	}
public static void main(String[] ar) {
	MethodinReturnType obj=new MethodinReturnType();
	int result=obj.compareNum();
	System.out.println("grater number amoung the a and b is"+result);
}
}

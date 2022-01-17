import java.util.Scanner;

public class CalculatorArthamtic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		double num1=sc.nextDouble();
		System.out.println("Enter the second number");
		double num2=sc.nextDouble();
		double add=num1+num2;
		double sub=num1-num2;
		double mul=num1*num2;
		double div=num1/num2;
		System.out.println("Addition"+add);
		System.out.println("Subration"+sub);
		System.out.println("Multiplication"+mul);
		System.out.println("Division"+div);
	
	}

}

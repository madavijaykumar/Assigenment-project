import java.util.Scanner;

public class ConversonPrimitiveDataTypes {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String st= sc.nextLine();
		char ch=st.charAt(0);
		int i=Integer.parseInt(st);
		long l=Long.parseLong(st);
		float f=Float.parseFloat(st);
		double d=Double.parseDouble(st);
		boolean b=Boolean.parseBoolean(st);
		System.out.println("char"+ch);
		System.out.println("integer"+i);
		System.out.println("long"+l);
		System.out.println("float"+f);
		System.out.println("double"+d);
		System.out.println("boolean"+b);
		
		        
	}

	}


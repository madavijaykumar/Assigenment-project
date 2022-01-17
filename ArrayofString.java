import java.util.Scanner;

public class ArrayofString {
	public static void main(String[] args) {
		String[] strArray= {"kgf","bahubali","pushpa"};
		boolean x=false;
		int n=0;
		String s="kgf";
		for(int i=0;i<strArray.length;i++) {
			if(s.equals(strArray[i])) {
				n=i;
				break;
				
			}
		}
		if(x=true)
			System.out.println(s+"String is found at index"+n);
		else
			System.out.println(s+"string is not found in the array");
	}

}

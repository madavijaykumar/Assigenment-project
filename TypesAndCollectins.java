import java.io.*;
import java.util.*;

public class TypesAndCollectins {
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5};
		Vector<Integer> V= new Vector();
		Hashtable<Integer,String>h= new Hashtable();
		V.addElement(1);
		V.addElement(3);
		h.put(1,"PawanKalyan");
		h.put(3, "Akhil");
		System.out.println(arr[0]);
		System.out.println(V.elementAt(0));
		System.out.println(h.get(3));
	}

}

import java.util.HashMap;
import java.util.Map;

public class UsingMaps {
	public static void main(String[] args) {
		Map<Integer,String > 
		Map=new HashMap<Integer,String>();
		Map.put(001,"vijay");
		Map.put(002,"NTR");
		Map.put(003,"kumar");
		for(Map.Entry M:Map.entrySet()) {
			System.out.println(M.getKey()+" "+ M.getValue());
		}
	}
	

}

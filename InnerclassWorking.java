
public class InnerclassWorking {
	public static void main(String[] args) {
		new Inner().in();
		
		
	}

}
class Inner{
	int val;
	

	public void in() {
		int val=06;
		System.out.println("inside inner class....");
		System.out.println("Access ingh local val"+val);
		System.out.println("Accessing inners instance val"+this.val);
		// TODO Auto-generated method stub
		
	}
	void met() {
		Inner ref=new Inner();
		ref.in();
	}
}

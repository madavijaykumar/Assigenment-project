
public class ConstructorDemo {
	
		int modelYear;
		String modelName;
	
		public ConstructorDemo(int year,String name){
			modelYear = year;
			modelName=name;
			
		}
		void display() {
		System.out.println(modelYear+" "+modelName);
		
		
	}

	public static void main(String args[]) {
		ConstructorDemo c1 = new ConstructorDemo (2000,"TATA");
		ConstructorDemo c2 = new ConstructorDemo (2001,"KIA");
				c1.display();
		         c2.display();
			}

}

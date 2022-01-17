
public class StringBufferAndBuilder {
	public static void main(String[] args) {
		StringBuffer buffer= new StringBuffer("good evening");
		buffer.append(" how was the day");
		StringBuilder builder=new StringBuilder("hello man");
		builder.append("your voice very low");
		System.out.println(builder);
	}

}

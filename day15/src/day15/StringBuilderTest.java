package day15;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("String Builder");
		
		str.append("AAA");
		System.out.println("append: "+ str);
		
		str.insert(2, "BBB");
		System.out.println("insert: "+ str);

		str.setCharAt(1, 'b');
		System.out.println("setChar: "+str);
		
		str.reverse();
		System.out.println("reverse: "+ str);
		
		str.setLength(30);
		System.out.println("SetLeng: "+str);

	}

}

package q2;

public class StringBuilderQuestions {

	public static void main(String[] args) {
		// I.Create StringBuilder Object
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		
		// II.Append string
		sb.append(" world");
		System.out.println(sb);
		
		// III.Delete string
		sb.delete(0, 6);
		System.out.println(sb);
		
		// IV.Insert string
		sb.insert(0, "Hi ");
		System.out.println(sb);
		
		// V. Replace string
		sb.replace(0, 2, "Hello");
		System.out.println(sb);
		
	}

}

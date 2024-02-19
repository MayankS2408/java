package Practice;

public class removewhitespace {

	public static void main(String[] args) {

		String str = "My Name is Mayank";
		String replacestr = str.replaceAll("\\s", "");

		System.out.println(replacestr);
	}

}

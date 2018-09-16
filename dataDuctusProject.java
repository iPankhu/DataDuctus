public class dataDuctusProject {
	public static String operation(String s) {
		StringBuilder sb = new StringBuilder();
		if (s.charAt(0) == '[') {

		} else {
			sb.append("Invalid!");
		}
		return sb.toString();
	}

	public static void main(String args[]) {
		String s = "1, 2, [A, B, C, [5^&, ) () 6, , 7], D, E], 3, 4]";
		System.out.println("OUPUT1: ");

	}
}

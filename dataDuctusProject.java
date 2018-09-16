public class dataDuctusProject {
	public static String operation(String s) {
		StringBuilder sb = new StringBuilder();
		if (s.charAt(0) == '[') {
			helper(s, sb);
		} else {
			sb.append("Invalid!");
		}
		return sb.toString();
	}

	private static void helper(String s, StringBuilder sb) {
		int open = 1, close = 0, count = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == '[') {
				open++;
				count = count + 2;
			} else if (s.charAt(i) == ']') {
				close++;
				count = count - 2;
			} else if (s.charAt(i) == ',') {
				sb.append("\n");
			} else if ((s.charAt(i) == ' ') && (s.charAt(i + 1) == ',')) {
				sb.append(" ");
			} else if (s.charAt(i) == ' ' && s.charAt(i - 1) != ',' && s.charAt(i + 1) != ',') {
				sb.append(s.charAt(i));
			} else if (s.charAt(i) != ' ') {
				sb.append(s.charAt(i));
			}
		}
	}

	public static void main(String args[]) {
		String s = "[1, 2, [A, B, C, [5^&, ) () 6, , 7], D, E], 3, 4]";
		System.out.println("OUPUT1: ");
		System.out.println(operation(s));

	}
}


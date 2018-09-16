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
				spaceCount(count, sb);
				sb.append(" ");
			} else if (s.charAt(i) == ' ' && s.charAt(i - 1) != ',' && s.charAt(i + 1) != ',') {
				sb.append(s.charAt(i));
			} else if (s.charAt(i) != ' ') {
				if (s.charAt(i - 1) == '[' || (s.charAt(i - 1) == ' ' && s.charAt(i - 2) == ',')) {
					spaceCount(count, sb);
				}
				sb.append(s.charAt(i));
			}
		}

		isBalanced(open, close, sb);

	}

	private static void spaceCount(int count, StringBuilder sb) {
		int p = count;
		while (p > 0) {
			sb.append(" ");
			p--;
		}
	}

	private static void isBalanced(int open, int close, StringBuilder sb) {
		if (open != close) {
			sb.setLength(0);
			sb.append("Invalid!");
		}
	}

	public static void main(String args[]) {
		String s = "[1, 2, [A, B, C, [5^&, ) () 6, , 7], D, E], 3, 4]";
		String p = "[1, 2, [A, B, C, [5, 6]]]";
		System.out.println("OUPUT1: ");
		System.out.println(operation(s));
		System.out.println("OUPUT2: ");
		System.out.println(operation(p));
	}
}

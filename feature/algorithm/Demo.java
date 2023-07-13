import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {
	private static final List<String> listTelex = Arrays.asList("aw", "aa", "dd", "ee", "oo", "ow", "w");

	public static int countVieLettersTelex(String strs) {
		int count = 0;
		String newStrs = strs.replaceAll("\\s+", "");
		for (String it : listTelex) {
			while (!newStrs.replaceFirst(it, "").equals(newStrs)) {
				newStrs = newStrs.replaceFirst(it, "");
				count++;
			}
		}
		return count;
	}

	public static boolean isAlpha(String strs) {
		return strs.matches("[a-zA-Z0-9]+");
	}

	public static boolean input() {
		Scanner scan = new Scanner(System.in);
		String strs = scan.nextLine();
		if (isAlpha(strs)) {
			System.out.println(countVieLettersTelex(strs));
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		while (!input()) {
			System.out.println("Vui lòng nhập lại (Chuỗi k được chưa ký tự đặc biệt hoặc khoảng trắng).");
		}
	}
}

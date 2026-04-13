import java.util.Scanner;

class Level3_Programs {

    // Convert to uppercase manually
    public static String toUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch;
        }
        return result;
    }

    // Convert to lowercase manually
    public static String toLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result += ch;
        }
        return result;
    }

    // Compare strings
    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String upper1 = toUpper(text);
        String upper2 = text.toUpperCase();

        System.out.println("Custom Upper: " + upper1);
        System.out.println("Built-in Upper: " + upper2);
        System.out.println("Match: " + compare(upper1, upper2));

        String lower1 = toLower(text);
        String lower2 = text.toLowerCase();

        System.out.println("Custom Lower: " + lower1);
        System.out.println("Built-in Lower: " + lower2);
        System.out.println("Match: " + compare(lower1, lower2));
    }
}
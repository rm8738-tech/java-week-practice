import java.util.Scanner;

class Level1_Programs {

    // Compare strings using charAt()
    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    // Create substring using charAt()
    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Convert to char array manually
    public static char[] getChars(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Compare Strings
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();

        boolean result1 = compareStrings(s1, s2);
        boolean result2 = s1.equals(s2);

        System.out.println("Custom Compare: " + result1);
        System.out.println("Built-in Compare: " + result2);

        // Substring
        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Start index: ");
        int start = sc.nextInt();
        System.out.print("End index: ");
        int end = sc.nextInt();

        String sub1 = customSubstring(text, start, end);
        String sub2 = text.substring(start, end);

        System.out.println("Custom Substring: " + sub1);
        System.out.println("Built-in Substring: " + sub2);

        // Char array
        char[] arr1 = getChars(text);
        char[] arr2 = text.toCharArray();

        System.out.println("Arrays equal: " + compareArrays(arr1, arr2));
    }
}
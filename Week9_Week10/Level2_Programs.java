class Level2_Programs {

    public static void nullPointerDemo() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException");
        }
    }

    public static void stringIndexDemo() {
        try {
            String text = "Hello";
            System.out.println(text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
        }
    }

    public static void illegalArgumentDemo() {
        try {
            String text = "Hello";
            System.out.println(text.substring(5, 2));
        } catch (Exception e) {
            System.out.println("Handled IllegalArgumentException");
        }
    }

    public static void numberFormatDemo() {
        try {
            String text = "abc";
            int num = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException");
        }
    }

    public static void arrayIndexDemo() {
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        nullPointerDemo();
        stringIndexDemo();
        illegalArgumentDemo();
        numberFormatDemo();
        arrayIndexDemo();
    }
}
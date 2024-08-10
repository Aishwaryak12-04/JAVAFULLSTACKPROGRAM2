public class CompareObjects {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        if (str1.equals(str2)) {
            System.out.println("Both objects are equal.");
        } else {
            System.out.println("Both objects are not equal.");
        }
    }
}

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153; 
        int originalNum = num;
        int result = 0;
        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, 3);
            num /= 10;
        }
        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}

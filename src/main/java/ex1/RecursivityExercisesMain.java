package ex1;

public class RecursivityExercisesMain {
    public static void main(String[] args) {
        //System.out.println(sumOfFirstNInt(7));
        //System.out.println(sumOfFirstEven(5));
        //System.out.println(checkIfPalindrome("madam"));
        //palindrome("ana");
        //System.out.println(sumOfDigits(31213));
        System.out.println(fibonacci(5));
    }

    private static int fibonacci(int n) {
        if (n == 0 || n == 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    private static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    private static void palindrome(String word) {
        if ((word == null) || (word.length() <= 1)) {
            System.out.println(word);
        } else {
            System.out.print(word.charAt(word.length() - 1));
            palindrome(word.substring(0, word.length() - 1));
        }
    }

    private static boolean checkIfPalindrome(String word) {
        if (word.length() == 0 || word.length() == 1) {
            return true;
        }
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return checkIfPalindrome(word.substring(1, word.length() - 1));
        }
        return false;
    }

    private static int sumOfFirstEven(int n) {
        if (n <= 1) {
            return 0;
        }
        if (n % 2 == 1) {
            return sumOfFirstEven(n - 1);
        }
        return n + sumOfFirstEven(n - 1);
    }

    private static int sumOfFirstNInt(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfFirstNInt(n - 1);
    }
}

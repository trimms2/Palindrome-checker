import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static boolean reverseMethod(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static boolean stackMethod(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < cleaned.length(); i++) {
            stack.push(cleaned.charAt(i));
        }


        for (int i = 0; i < cleaned.length(); i++) {
            if (cleaned.charAt(i) != stack.pop()) {
                return false;
            }


    while (start < end) {
        if (normalized.charAt(start) != normalized.charAt(end)) {
            isPalindrome = false;
            break;

        String reversed = "";


       char[] characters = original.toCharArray();



        for (int i = 0; i < original.length(); i++) {
            deque.addLast(original.charAt(i));


        }

        return true;
    }

    public static boolean dequeMethod(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < cleaned.length(); i++) {
            deque.add(cleaned.charAt(i));
        }

        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        long start, end;


        PalindromeStrategy strategy;


        start = System.nanoTime();
        boolean reverseResult = reverseMethod(input);
        end = System.nanoTime();
        long reverseTime = end - start;

        start = System.nanoTime();
        boolean stackResult = stackMethod(input);
        end = System.nanoTime();
        long stackTime = end - start;

        start = System.nanoTime();
        boolean dequeResult = dequeMethod(input);
        end = System.nanoTime();
        long dequeTime = end - start;

        System.out.println("\nResults:");
        System.out.println("Reverse Method: " + (reverseResult ? "Palindrome" : "Not Palindrome")
                + " | Time: " + reverseTime + " ns");

        System.out.println("Stack Method: " + (stackResult ? "Palindrome" : "Not Palindrome")
                + " | Time: " + stackTime + " ns");

        System.out.println("Deque Method: " + (dequeResult ? "Palindrome" : "Not Palindrome")
                + " | Time: " + dequeTime + " ns");

        if (strategy.checkPalindrome(input)) {


        if (checker.checkPalindrome(input)) {

            System.out.println("Palindrome");
          
        } else {
            System.out.println("Not a Palindrome");
        }
        scanner.close();
    }
}

        if (isPalindrome) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }


        String input="madam";
        boolean isPalindrome=true;
        String reversed="";
        int n=input.length();
        for(int i =n;i>=0;i--) {
            reversed=reversed+input.charAt(i);
        }

        if(input.equals(reversed)) {

            System.out.println("Is it Palindrome "+isPalindrome);
        }


        String input = "madams";

        boolean isPalindrome = true;


        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input Text: " + input);
        System.out.println("Is it Palindrome: " + isPalindrome);


    }



}


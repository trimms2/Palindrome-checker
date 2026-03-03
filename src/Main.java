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

        scanner.close();
    }
}
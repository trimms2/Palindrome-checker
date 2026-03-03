public class Main {
    public static void main(String[] args) {

        String original = "madam";


        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }


        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }


        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }

}

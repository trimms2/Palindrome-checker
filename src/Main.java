public class Main {
    public static void main(String[] args) {

        String original = "madam";


        Stack<Character> stack = new Stack<>();


        String reversed = "";


       char[] characters = original.toCharArray();



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

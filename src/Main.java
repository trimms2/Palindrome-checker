public class Main {
    public static void main(String[] args) {



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

    }

}

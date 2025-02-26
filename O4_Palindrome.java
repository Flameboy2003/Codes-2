package ABCTech;

public class O4_Palindrome {
    public static void main(String[] args) {
         String s = "liril";

        char x[] = s.toCharArray();
        int size = x.length;

        boolean isPalindrome = true;

        for (int i = 0; i < size / 2; i++) {
            if (x[i] != x[size - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }
}

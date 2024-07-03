public class A05 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); // expect true;
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // expect true
        System.out.println(isPalindrome("Java")); // expect false
    } // method main

    static boolean isPalindrome(String string) {
        int left = 0;  // Starting with the first spot
        int right = string.length() - 1; // starting with the last spot

        while (left < right) { // only checks for while the left in is to the left of the right int
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left++;
            right--; //left goes right, while right goes left
        }

        return true;
    }


}

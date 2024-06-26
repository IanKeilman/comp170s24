public class A04 {

    public static void main(String[] args) {

        System.out.print("Odd characters: ");
        printOddCharacters("Springfield"); // Expect: p i g i l

        System.out.print("Even characters: ");
        printEvenCharacters("Springfield"); // Expect: S r n f e d
    }

    // Method to print characters found in odd positions
    static void printOddCharacters(String string) {
        for (int position = 1; position < string.length(); position += 2) {
            System.out.print(string.charAt(position) + " ");
        }
        System.out.println();
    }

    // Method to print characters found in even positions
    static void printEvenCharacters(String string) {
        for (int position = 0; position < string.length(); position += 2) {
            System.out.print(string.charAt(position) + " ");
        }
        System.out.println();
        
    }
}
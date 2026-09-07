class Palindrome {
    public static void main(String[] args) {
        int a = 1321;
        int temp = a;
        int c = 0;
        while (a > 0) {
            c *= 10;
            c += a % 10;
            a/=10;
        }
        if(temp==c){
            System.out.println("Palidrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}

// Reverse a string
// Check palindrome 
// Count characters/frequency
// Find duplicate characters
// Check anagrams
// Remove duplicate characters
// Find first non-repeating character
// Find substring
// Replace characters
// Count vowels/consonants
// Reverse words
// Compare two strings
// Find longest word
// Character frequency
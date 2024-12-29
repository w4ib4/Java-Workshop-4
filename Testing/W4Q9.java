package Testing;
class StringManipulator {
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public String toUpperCase(String input) {
        return input.toUpperCase();
    }

    public boolean isPalindrome(String input) {
        String reversed = reverse(input);
        return input.equalsIgnoreCase(reversed);
    }

    public int countVowels(String input) {
        return (int) input.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }
}
public class W4Q9 {

}

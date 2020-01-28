import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        String input = sc.next();
        char[] word = new char[input.length()];
        for (int i = input.length() - 1, j = 0; i >= 0; i--, j++) {
            word[j] = input.charAt(i);
        }
        System.out.println(word);

    }
}

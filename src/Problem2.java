import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        String input = sc.next();
        String[] word = input.split("");
        int length = 0;

        for (String ch: word) {
            length++;
        }

        System.out.println(length);

    }
}


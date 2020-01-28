import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int numEvens = 0;
        int numOdds = 0;

        for (int i = 0; i <= 9; i++) {
            System.out.print("Please enter a number: ");
            int number = sc.nextInt();
            numbers[i] = number;

            if (number % 2 == 0) {
                numEvens += 1;
            }
            else {
                numOdds += 1;
            }

        }

        System.out.println("There are " + numEvens + " even numbers in the array.");
        System.out.println("There are " + numOdds + " odd numbers in the array.");

    }
}

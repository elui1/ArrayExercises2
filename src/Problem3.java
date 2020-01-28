import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Set set = new HashSet();

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i <= 9; i++) {
            System.out.print("Please enter a number: ");
            int number = sc.nextInt();
            numbers.add(number);
        }
//        set.addAll(numbers);
//        System.out.println(set);

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) == numbers.get(j)) {
                    numbers.remove(Integer.valueOf(numbers.get(i)));
                    --j;
                    }
                }
            }

        for (int i : numbers) {
            System.out.println(i);
        }
    }
}

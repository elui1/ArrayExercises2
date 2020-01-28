import java.util.ArrayList;

public class Problem4 {
    public static void main(String[] args) {
        int[] array1 = {1, 7, 6, 5, 9};
        int[] array2 = {2, 7, 6, 3, 4};
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] + array2[j] == 13) {
                    if ((!numbers.contains(array1[i])) && (!numbers.contains(array2[j]))) {
                        numbers.add(array1[i]);
                        numbers.add(array2[j]);
                    }
                }
            }
        }
        for (int i = 0; i < numbers.size() - 1; i += 2) {
            System.out.println("(" + numbers.get(i) + "," + numbers.get(i + 1) + ")");
        }
    }
}


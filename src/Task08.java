import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        System.out.println("Задание 8");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        char[] arr = new char[n];
        Random r = new Random();


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (r.nextInt(26) + 'a');
        }


        Map<Character, Integer> countMap = new HashMap<>();
        for (char letter : arr) {
            countMap.put(letter, countMap.getOrDefault(letter, 0) + 1);
        }

        // Printing the letters that occur more than 3 times
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            char letter = entry.getKey();
            int count = entry.getValue();
            if (count > 3) {
                System.out.println("Letter: " + letter + ", Count: " + count);
            }
        }
    }
}





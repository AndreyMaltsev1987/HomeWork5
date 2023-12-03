import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("Задание 2");

                int[] arr = new int[30];
                Random r = new Random();

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = r.nextInt(121) - 70;
                }

                int min = arr[0];
                int max = arr[0];

                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }

                System.out.println("Минимальный элемент: " + min);
                System.out.println("Максимальный элемент: " + max);
            }
        }





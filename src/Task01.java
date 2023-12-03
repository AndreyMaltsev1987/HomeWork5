public class Task01 {
    public static void main(String[] args) {
        System.out.println("Задание 1");

                int[] fibonacciNumbers = new int[15];

                fibonacciNumbers[0] = 0;
                fibonacciNumbers[1] = 1;

                for (int i = 2; i < 15; i++) {
                    fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
                }

                for (int number : fibonacciNumbers) {
                    if (number % 2 == 0) {
                        System.out.println(number);
                    }
                }
            }
    }


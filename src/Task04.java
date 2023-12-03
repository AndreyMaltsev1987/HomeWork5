public class Task04 {
    public static void main(String[] args) {
        System.out.println("Задание 4");

        int[] arr = {2, 3, 4, 5, 2}; // Пример инициализации массива

        boolean razlichnye = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                razlichnye = false;
                break;
            }
        }

        if (razlichnye) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}




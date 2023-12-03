public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание 3");
        int[] arr = {2, 3, 2, 2, 3};

        boolean ravnie = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                ravnie = false;
                break;
            }
        }

        if (ravnie) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


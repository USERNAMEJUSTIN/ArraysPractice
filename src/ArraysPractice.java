void main() {

    // ЗАДАЧА 1

//    int[] array = {5, 3, -5, 0, 12, -11, -6, 7, 0, -3};
//    System.out.print("Array: ");
//    for (int i : array) {
//        System.out.print(i + " ");
//    }
//    int negative = 0, positive = 0, zero = 0;
//    for (int check : array) {
//        if (check < 0) {
//            negative++;
//        } else if (check > 0) {
//            positive++;
//
//        } else if (check == 0) {
//            zero++;
//        }
//    }
//    System.out.println("\nPositive: " + positive);
//    System.out.println("Negative: " + negative);
//    System.out.println("Zero: " + zero);

    // ЗАДАЧА 2

//    int[] array = {1, 5, 2, 0, 12, 11, 6, 7};
//    System.out.print("Array: ");
//    for (int i : array) {
//        System.out.print(i + " ");
//    }
//    int min = array[0];
//    int max = array[0];
//    for (int check : array) {
//        if (check < min) {
//            min = check;
//        }
//        if (check > max) {
//            max = check;
//        }
//    }
//    System.out.println("\nSmallest: " + min + " at index 3");
//    System.out.println("Largest: " + max + " at index 4");

    // ЗАДАЧА 3

//    int[] array = {10, 20, 30, 40, 50, 60};
//    System.out.print("Array: ");
//    for (int i : array) {
//        System.out.print(i + " ");
//    }
//    float average = (array[0] + array[1] + array[2] + array[3] + array[4] + array[5]) / array.length;
//    int quantity = 0;
//    for (float check : array) {
//        if (check > average) {
//            quantity++;
//        }
//    }
//    System.out.println("\nAverage: " + average);
//    System.out.println("Numbes above average: " + quantity);

    // ЗАДАЧА 4

//    int[] array = {10, 20, 30, 40, 50, 60, 70};
//    System.out.print("Original: ");
//    for (int i : array) {
//        System.out.print(i + " ");
//    }
//    System.out.print("\nReversed: ");
//    for (int i = array.length - 1; i >= 0; i--) {
//        System.out.print(array[i] + " ");
//    }

    // ЗАДАЧА 5

    int cycle = 0;
    while (cycle == 0) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int pass = 0, fail = 0;
        for (int change = 0; change < array.length; change++) {
            System.out.print("Enter number (between 0 and 100): ");
            int value = sc.nextInt();
            if (value < 0 || value > 100) {
                System.out.println("Failed!");
                break;
            } else {
                array[change] = value;
                if (value >= 60) {
                    pass++;
                } else if (value < 60) {
                    fail++;
                }
            }
        }
            float average = (array[0] + array[1] + array[2] + array[3] + array[4]) / array.length;
            System.out.print("Scores: ");
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println("\nPassed: " + pass);
            System.out.println("Failed: " + fail);
            System.out.println("Average: " + average);
        }
    }

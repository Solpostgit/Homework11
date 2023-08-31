public class Main {
    public static int countsLeapYear(int year) {
        Boolean leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0); // определяем високосный год, как
        // каждый четвертый и не каждый сотый, или каждый четырёхсотый.
        if (leapYear) {
            System.out.printf("%d год является високосным \n", year);
        } else
            System.out.printf("%d год не является високосным \n", year);
        return year;
    }

    public static void changeOS(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else System.out.println("Установите версию приложения для Android по ссылке");
        } else
            System.out.println("Используйте телефон с iOS или Android");
    }

    public static void main(String[] args) {
        task1();
        task2();/*
        task3();*/
    }

    public static void task1() {
        System.out.println("Task 1");
        countsLeapYear(2021);
    }

    public static void task2() {
        System.out.println("Task 2");
        changeOS(1, 2023);
    }
}
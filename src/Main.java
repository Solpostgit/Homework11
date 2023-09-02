import java.time.LocalDate;

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
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else System.out.println("Установите версию приложения для Android по ссылке");
        } else
            System.out.println("Используйте телефон с iOS или Android");
    }

    public static int deliveryCard(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.printf("Потребуется дней: %d \n", deliveryTime);
        } else if ((deliveryDistance >= 20) && (deliveryDistance < 60)) {
            deliveryTime = deliveryTime + 1;
            System.out.printf("Потребуется дней: %d \n", deliveryTime);
        } else if ((deliveryDistance >= 60) && (deliveryDistance < 100)) {
            deliveryTime = deliveryTime + 2;
            System.out.printf("Потребуется дней: %d \n", deliveryTime);
        } else System.out.println("Доставки нет");
        return (deliveryTime);
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Task 1");
        countsLeapYear(2021);
    }

    public static void task2() {
        System.out.println("Task 2");
        changeOS(0, 2023);
    }

    public static void task3() {
        System.out.println("Task 3");
        deliveryCard(95);
    }
}
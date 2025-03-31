import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        byte oS = 0;
        short year = 2024;
        int distance = 50;
        calculationOfYear(year);
        definitionOfSystem(oS, year);
        calculationDistance(distance);
    }

    public static void definitionOfSystem(byte clientOS, short clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();


        if (clientDeviceYear >= currentYear) {
            System.out.print("Установите обычную версию приложения для ");
        } else {
            System.out.print("Установите облегченную версию приложения для ");
        }
        if (clientOS == 1) {
            System.out.println("для Android по ссылке\n");
        } else {
            System.out.println("iOS по ссылке\n");
        }
    }

    public static void calculationDistance(int deliveryDistance) {

        short deliverytime = 0;
        if (deliveryDistance <= 20) {
            deliverytime = 1;
            System.out.println("Потребуется дней: " + deliverytime + "\n");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliverytime = 2;
            System.out.println("Потребуется дней: " + deliverytime + "\n");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliverytime = 3;
            System.out.println("Потребуется дней: " + deliverytime + "\n");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет\n");
        }
    }

    public static void calculationOfYear(short yearForMethod) {
        int calculationModFour = yearForMethod % 4;
        int calculationModHundreed = yearForMethod % 100;
        int calculationModFourHundreed = yearForMethod % 400;
        if (yearForMethod >= 1854) {
            if (calculationModFourHundreed == 0) {
                System.out.println(yearForMethod + " год является високосным\n");
            } else if (calculationModHundreed == 0) {
                System.out.println(yearForMethod + " год не является високосным\n");
            } else if (calculationModFour == 0) {
                System.out.println(yearForMethod + " год является високосным\n");
            } else {
                System.out.println(yearForMethod + " год не является високосным\n");
            }
        } else {
            System.out.println(yearForMethod + " год не является високосным\n");
        }

    }

}
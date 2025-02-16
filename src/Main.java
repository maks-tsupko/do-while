public class Main {
    public static void main(String[] args) {
        // задача 1
        System.out.println("задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_490_000) {
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + " - " + total);
        }
        // задача 2
        System.out.println("задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        for (int a = 10; a > 0; a--) {
            System.out.print(" " + a);
        }
        //задача 3
        System.out.println("Задача 3");
        int Y = 12_000_000;
        int born = 17;
        int died = 8;
        for (int year = 1; year <= 10; year++) {
            Y += Y * (born - died) / 1000;
            System.out.println("Год " + year + " численность населения состовляет " + Y + " человек");
        }
        //задача 4
        System.out.println("задача 4");
        double money = 15000;
        int b = 0;
        double bankPercent = 0.07;
        int all = 12_000_000;
        while (money < all) {
            b = b + 1;
            money = money + money * bankPercent;
            System.out.println("Сумма " + money + " , количество месяцев " + b);
        }
        //задача 5
        System.out.println("Задача 5");
        double money1 = 15000;
        double bankPercent1 = 0.07;
        int all1 = 12_000_000;
        int period1 = 6;
        for (int i1 = 0; money1 < all1; i1++) {
            money1 = money1 + money1 * bankPercent1;
            if (i1 % period1 == 0) {
                System.out.println("Сумма " + money1 + " , количество месяцев " + i1);
            }
        }
        //задача 6
        System.out.println("Задача 6");
        double money2 = 15000;
        int period = 6;
        int years = 9;
        int allMonth = years * 12;
        double bankPercent2 = 0.07;
        for (int i2 = 0; i2 <= allMonth; i2++) {
            money = money + money * bankPercent;
            if (i2 % period == 0) {
                System.out.println("Сумма " + money + " , количество месяцев " + i2);
            }
        }
        //задача 7
        System.out.println("Задача 7");
        for (int fr = 1; fr < 31; fr += 7) {
            System.out.println("Сегодня пятница " + fr + " необходимо подготовить отчет");
        }
        //задача 8
        System.out.println("Задача 8");
        int currentYear = 2023;
        for (int i3 = 0; i3 < currentYear + 100; i3 += 79) {
            if (i3 > currentYear - 200) {
                System.out.println(i3);
            }
        }
    }
}
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
        int y = 12_000_000;
        int born = 17;
        int died = 8;
        for (int year = 1; year <= 10; year++) {
            y += y * (born - died) / 1000;
            System.out.println("Год " + year + " численность населения состовляет " + y + " человек");
        }
        //задача 4
        System.out.println("задача 4");
        double money = 15000;
        int b = 0;
        double bankPercent = 0.07;
        int all = 12_000_000;
        while (money < all) {
            b++;
            money = money + money * bankPercent;
            System.out.println("Сумма " + money + " , количество месяцев " + b);
        }
        //задача 5
        System.out.println("Задача 5");
        double moneyTwo = 15000;
        double bankPercentTwo = 0.07;
        int allTwo = 12_000_000;
        int periodTwo = 6;
        for (int k = 0; moneyTwo < allTwo; k++) {
            moneyTwo = moneyTwo + moneyTwo * bankPercentTwo;
            if (k % periodTwo == 0) {
                System.out.println("Сумма " + moneyTwo + " , количество месяцев " + i);
            }
        }
        //задача 6
        System.out.println("Задача 6");
        double moneyThree = 15000;
        int period = 6;
        int years = 9;
        int allMonth = years * 12;
        double bankPercent2 = 0.07;
        for (int j = 0; j <= allMonth; j++) {
            money = money + money * bankPercent;
            if (j % period == 0) {
                System.out.println("Сумма " + money + " , количество месяцев " + j);
            }
        }
        //задача 7
        System.out.println("Задача 7");
        for (int a = 1; a < 31; a += 7) {
            System.out.println("Сегодня пятница " + a + " необходимо подготовить отчет");
        }
        //задача 8
        System.out.println("Задача 8");
        int currentYear = 2023;
        for (int c = 0; c < currentYear + 100; c += 79) {
            if (c > currentYear - 200) {
                System.out.println(c);
            }
        }
    }
}
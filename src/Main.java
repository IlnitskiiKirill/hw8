//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int firstFriday = 1;
        for (int i = 1; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница " + i + " -ое число месяца. Необходимо подготовить отчёт!");
        }
        System.out.println("Задача №2");
        int distance = 42195;
        int step = 500;
        do {
            System.out.println("Держись! осталось  " + distance + " метров");
            distance = distance - step;
        } while (distance >= 0);

        System.out.println("Задача №2 вариант №2");
        for (int i = 42195; i > 0; i = i - 500) {
            System.out.println("Держись! осталось  " + i + " метров");
        }
        System.out.println("Задача №3");
        int day = 0;

        System.out.println("Задача №4");
        int month = 0;
        double total = 0;
        while (total < 12_000_000) {
            total = total + 15000;
            month++;
            if (month % 6 == 0) {
                total = total * 1.07;
                if (total >= 12_000_000)
                    break;
            }
            System.out.println("Месяц " + month + " Сумма " + total);
        }
        System.out.println("Задача №5");
        int charge = 20;
        int min = 0;
        int overhearts = 0;
        while (charge < 100 && overhearts <= 3) {
            min++;
            charge = charge + 2;
            if (min % 10 == 0) {
                overhearts++;
                min += 2;
                System.out.println(" Случился перегрев " + overhearts);
                continue;
            }
            System.out.println("Заряд " + charge + " %");
            if (overhearts == 3)
                break;
            System.out.println("Зарядка прекращена. Текущий заряд " + charge + " %");
        }
        System.out.println("Время зарядки составило " + min + " минут");

    }

}











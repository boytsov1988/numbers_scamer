package ru.itmonopoly.alllessons.lesson3;

public class ForCycl {
    public static void main(String[] args) {
        int x;
        x = 25;
        int i = 15;
        for (; i <= x; i += 1) {
            //break;
            //continue;
            System.out.println("Cycle for " + i);
        }
        for (; i <= x; i += 1) {
            System.out.println("Cycle for " + i);
        }

        for (int i1 = 0; i1 < 101; i1++) {

            if (i1 % 10 != 0) {
                System.out.println("Пропуск");
                continue;

            }
            double y=Math.sin(i1);
            if (y>0.5) {
                break;
            }

            System.out.println("Cycle for 1111 " + i1);
            if (i1 > 50) {
                break;
            }
        }
        System.out.println("Вне цикла");
    }
}

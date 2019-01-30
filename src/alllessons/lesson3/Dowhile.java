package ru.itmonopoly.alllessons.lesson3;

public class Dowhile {
    public static void qwe() {
        int x=0;
        //while(x<-10){
         //   System.out.println("x="+x);
        //    x++;
        //}
        int i=1;
        do{
            System.out.println("i="+i);
            i++;
            if (i>5){
                break;
            }
                //break;
        }while(i<=10);
        System.out.println("out cycle");
    }
}

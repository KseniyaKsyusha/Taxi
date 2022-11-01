package ua.en.kosse;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import java.util.List;

public class Driver {
    public static double km = 12; // ціна за годину
    public static double wt = 5; // ціна простоя


    public static void main(String[] args) {
        int max = 20;
        List d = new ArrayList<>();
        List w = new ArrayList<>();
        Taxi taxi = new Taxi(1, 14, "Matiz", Boolean.TRUE);
        Travel travel = new Travel(d, w, taxi);
        // Такси проехало по 4 адресам, между этими прибытием и отправкой есть время ожидания

        for (int i = 0; i < 4; i++) {
            double n = new Random().nextInt(max);
            travel.setAddDistans(n);
            //System.out.println(travel.distans.get(i));
        }

        System.out.println(d);
        // Такси проехало по 4 адресам, генерация массива ожидания клиента
        for (int i = 0; i < 3; i++) {
            double n1 = new Random().nextInt(max);
            travel.setAddWait((int) n1);
            //System.out.println(travel.wait.get(i));
        }
        // 4 элементу массива Wait присваивается значение 0 (приехали в последний пункт назначения)
        travel.setAddWait(0);
        System.out.println(w);
        travel.reisen(travel);

        //w.stream().map( i-> new Random().nextInt(max)).forEach(System.out.println(travel.distans.get(i)));
    }


}
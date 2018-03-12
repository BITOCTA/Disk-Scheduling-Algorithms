package disk_scheduling_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Lab2 {

    public static int[] CreateRandom(int max_number, int max_size) {
        int min =2;

        max_number-=min;
        int m = (int) (Math.random()*++max_number)+min;

        int[] mas = new int[m];
        System.out.println("The number of " + m + " requests was created");
        for (int i = 0; i < mas.length; i++) {
            double k = Math.random();
            int l = (int) (k * max_size);

            System.out.println("The " + i + " init number is " + l);
            mas[i] = l;
        }
        return mas;
    }

    public static int startInit()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("-----");
        System.out.println("Please, enter the start init");
        System.out.println("-----");
        int startinit = in.nextInt();
        return startinit;
    }


    public static void which_is_faster(int size, int max_number, int max_size)
    {
        int i = 0;
        int number1 =0;
        int number2 =0;
        int number3 =0;
        int number4 =0;

        while(i<size)
        {
            int start = (int) (Math.random() * 100);
            int[] mas = CreateRandom(max_number, max_size);
            number1+=FCFS.FCFS(mas,start);
            number2+=SSTF.sstf(mas,start);
            number3+=SCAN.SCAN(mas,start);
            number4+=CSCAN.CSCAN(mas,start);
            i++;
        }
        System.out.println("Average head movement for FCFS alorithm - " + number1/i);
        System.out.println("Average head movement for SSTF alorithm - " + number2/i);
        System.out.println("Average head movement for SCAN alorithm - " + number3/i);
        System.out.println("Average head movement for C-SCAN alorithm - " + number4/i);

    }

    public static void compare(int[] mas, int start)
    {
        System.out.println("-");
        System.out.println("FCFS");
        System.out.println("-");
        System.out.println("Total head movements using FCFS algorithm - " + FCFS.FCFS(mas, start));
        System.out.println("-");
        System.out.println("SSTF");
        System.out.println("-");
        System.out.println("Total head movements using SSTF algorithm - " + SSTF.sstf(mas, start));
        System.out.println("-");
        System.out.println("SCAN");
        System.out.println("-");
        System.out.println("Total head movements using SCAN algorithm - " + SCAN.SCAN(mas, start));
        System.out.println("-");
        System.out.println("C-SCAN");
        System.out.println("-");
        System.out.println("Total head movements using C-SCAN algorithm - " + CSCAN.CSCAN(mas, start));
    }



    public static void main(String[] args)
    {

        which_is_faster(10, 100, 1000);



    }


}

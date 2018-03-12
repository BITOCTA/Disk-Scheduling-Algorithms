package disk_scheduling_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Lab2 {

    public static int[] CreateRandom() {
        int min =2;
        int max =10;
        max-=min;
        int m = (int) (Math.random()*++max)+min;

        int[] mas = new int[m];
        System.out.println("The number of " + m + " requests was created");
        for (int i = 0; i < mas.length; i++) {
            double k = Math.random();
            int l = (int) (k * 100);

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


    public static void which_is_faster(int size)
    {
        int i = 0;
        int number1 =0;
        int number2 =0;
        int number3 =0;
        int number4 =0;

        while(i<size)
        {
            int start = (int) (Math.random() * 100);
            int[] mas = CreateRandom();
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








    }


}

package disk_scheduling_algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class CSCAN {
    static int CSCAN(int[] mas, int start)
    {


        ArrayList<Integer> int1 = new ArrayList<>();
        ArrayList<Integer> int2 = new ArrayList<>();
        Arrays.sort(mas);
        int2.add(start);
        for(int i = 0;i<mas.length;i++)
        {
            if(start>mas[i])
            {
                int1.add(mas[i]);
            }
            if(start<mas[i])
            {
                int2.add(mas[i]);
            }
        }

        int2.add(100);
        int2.add(0);

        for(int i = 0; i<int1.size(); i++)
        {
            int2.add(int1.get(i));
        }

        System.out.print("The path is --- ");
        System.out.print(" [START] " + start + ""  );

        for(int i = 1; i<int2.size(); i++)
        {
            System.out.print(" -> " +int2.get(i));
        }

        System.out.println(" ");

        int number_of_moves = 0;
        for(int i = 0; i<int2.size()-1; i++)
        {
            number_of_moves+=Math.abs(int2.get(i+1)-int2.get(i));

        }
        return number_of_moves;




    }
}

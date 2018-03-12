package disk_scheduling_algorithm;

import java.util.Arrays;

public class SCAN {
    static int SCAN(int sequence[],int start) {




        int n = sequence.length;
        int scan[] = new int[n + 1];
        int temp[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            temp[i] = sequence[i];
        }
        temp[n] = 0;
        Arrays.sort(temp);

        int index = 0;
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] >start ) {
                index = i - 1;
                break;
            }
        }
        int k = 0;

        for (int i = index; i >= 0; --i, ++k) {
            scan[k] = temp[i];
        }

        for (int i = index + 1; i < temp.length; i++, ++k) {
            scan[k] = temp[i];
        }

        int number_of_moves = 0;



        System.out.print("The path is --- ");
        System.out.print(" [START] " + start + "");

        for(int i = 0; i<scan.length; i++)
        {
            System.out.print(" -> " +scan[i]);
        }

        System.out.println(" ");

        number_of_moves = Math.abs(scan[0]-start);

        for(int i =0; i<scan.length-1;i++)
        {


            number_of_moves+=Math.abs(scan[i+1]-scan[i]);


        }


        return number_of_moves;



    }
}

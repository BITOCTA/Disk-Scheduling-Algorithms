package disk_scheduling_algorithm;

public class SSTF {
    public static int sstf(int[] mas, int start)
    {



        int start1=start;

        int n = mas.length;
        int sstf[] = new int[n];
        for(int i =0; i < n; i++){
            sstf[i] = mas[i];
        }

        int ii = -1;
        for(int i =0; i<n; i++) {
            int minimum = Integer.MAX_VALUE;
            ii = i;
            for (int j = i; j < n; j++) {
                int distance = Math.abs(start - sstf[j]);
                if (distance < minimum) {
                    ii = j;
                    minimum = distance;
                }
            }
            int tmp = sstf[i];
            sstf[i] = sstf[ii];
            sstf[ii] = tmp;
            start = sstf[i];

        }

        int number_of_moves = 0;


        System.out.print("The path is --- ");
        System.out.print(" [START] " + start1 + "");
        for(int i = 0; i<sstf.length; i++)
        {
            System.out.print(" -> " +sstf[i]);
        }

        System.out.println(" ");

        number_of_moves = Math.abs(sstf[0]-start1);




        for(int i =0; i<sstf.length-1;i++)
        {
            if(sstf[i]==0 || sstf[i+1]==0)
            {
                number_of_moves+=0;
            }
            else
            {
                number_of_moves+=Math.abs(sstf[i+1]-sstf[i]);
            }

        }


        return number_of_moves;


    }
}

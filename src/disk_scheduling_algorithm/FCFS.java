package disk_scheduling_algorithm;

public class FCFS {
    public static int FCFS(int[] mas, int start)
    {
        int number_of_moves=0;


        System.out.print("The path is --- ");
        System.out.print(" [START] " + start + "");
        for(int i = 0; i<mas.length; i++)
        {
            System.out.print(" -> " +mas[i]);
        }

        System.out.println(" ");
        if(start>=mas[0]) {
            number_of_moves = start - mas[0];
        }
        if(start<mas[0]){
            number_of_moves = mas[0] - start;
        }
        for(int i = 0; i<mas.length-1; i++)
        {
            if(mas[i]<mas[i+1])
            {
                number_of_moves+=mas[i+1]-mas[i];
            }
            if(mas[i]>=mas[i+1])
            {
                number_of_moves+=mas[i]-mas[i+1];
            }
        }

        return number_of_moves;
    }
}

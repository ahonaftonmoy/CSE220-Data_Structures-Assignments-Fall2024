import java.util.Scanner;
public class Tester{
    public static void main(String [] args){
        
        Scanner sc=new Scanner(System.in);

        //Task3
        System.out.println("Task 3-");

        System.out.println("Enter the number of tasks:");
        int taskN=sc.nextInt();
        int [] tasks=new int[taskN];

        System.out.println("Enter the time taken for each task:");
        for(int i=0;i<tasks.length;i++){
            tasks[i]=sc.nextInt();
        }

        System.out.println("Enter the number of Machines:");
        int m=sc.nextInt();

        int[] arr=Task3.t3(tasks,m);
        System.out.println("Result:");
        display(arr);

        //Task4
         System.out.println("Task 4-");

        System.out.println("Enter the number of numbers:");
        int numN=sc.nextInt();
        int [] nums=new int[numN];

        System.out.println("Enter the numbers");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println("k:");
        int k=sc.nextInt();

        int[] large=Task4.t4(nums,k);
        System.out.println("Top "+k+" largest numbers are: ");
        display(large);

    }

    public static void display(int []arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.println(arr[i]+"]");
            }
            else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.println("\n");
    }
}
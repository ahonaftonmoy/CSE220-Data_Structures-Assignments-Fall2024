import java.util.Scanner;

public class Task1 {

    // Task 1A: Print numbers from 1 to 10 using a loop
    public static void task1A() {
        int i=1;
        while(i<11){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
    }

    // Task 1B: Print numbers from 1 to 10 using recursion
    public static void task1B_recursive(int i) {
        // TODO: Implement this recursively
    }

    // Task 1C: Print numbers from 1 to n using a loop
    public static void task1C(int n) {
        int i=1;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
    }

    // Task 1D: Print numbers from 1 to n using recursion
    public static void task1D_recursive(int i, int n) {
        // TODO: Implement this recursively
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        task1A();
        task1C(15);

        sc.close();
    }
}

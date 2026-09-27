public class Tester{
    public static void main(String [] args){
        int[][] g=new int[7][7];
        task2.insert(0,1,5,g);
        task2.insert(0,2,6,g);
        task2.insert(0,3,7,g);
        task2.insert(0,4,8,g);
        task2.insert(0,5,9,g);
        task2.insert(0,6,10,g);
        task2.insert(1,2,11,g);
        task2.insert(1,3,12,g);
        task2.insert(1,4,13,g);
        task2.insert(1,5,14,g);
        task2.insert(1,6,15,g);
        task2.insert(2,3,16,g);
        task2.insert(2,4,17,g);
        task2.insert(3,4,18,g);
        task2.insert(4,5,19,g);
        task2.insert(5,6,20,g);
        System.out.println("Maximum sum of edge weight vertex-"+task2.max2a(g));
    }
}
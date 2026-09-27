public class Task3{
    
    public static int[] t3(int [] task, int m){
        MinHeap h=new MinHeap(m);

        for(int i=0;i<m;i++){
            h.insert(0);
        }  

        for(int t=0;t<task.length;t++){
            int min=h.extractMin();
            h.insert(min+task[t]);
        }          

        int[] arr= new int[m];
        for(int i=0;i<m;i++){
            arr[i]=h.extractMin();
        }
        return arr;
    }
}
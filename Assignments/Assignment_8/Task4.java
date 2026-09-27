public class Task4{
    public static int[] t4(int [] nums, int k){
        MaxHeap h=new MaxHeap(nums.length+1);

        for(int i=0;i<nums.length;i++){
            h.insert(nums[i]);
        }

        int[] arr=new int[k];

        for(int i=0;i<k;i++){
            arr[i]=h.extractMax();
        }

        return arr;
    }
}
public class MaxHeap{

    private int size;
    private int [] heap;

    MaxHeap(int n){
        this.heap=new int[n];
    }

    public void insert(int key){
        if(this.size<this.heap.length-1){
            this.heap[++this.size]=key;
            swim(this.size);
        }
    }

    public void swim(int idx){
        if(idx<=1){
            return;
        }
        int par=idx/2;
        if(this.heap[idx]>this.heap[par]){
            swap(this.heap,idx,par);
            swim(par);
        }
    }

    private void swap(int [] heap, int i1, int i2){
        int temp=this.heap[i1];
        this.heap[i1]=this.heap[i2];
        this.heap[i2]=temp;
    }

    public int extractMax(){
        if(this.size==0){
            return -1;
        }
        int max=heap[1];
        swap(this.heap,--size,1);
        sink(1);
        return max;
    }

    public void sink(int idx){
        int big=idx;
        int left=2*idx;
        int right=2*idx+1;

        if(left<this.size && heap[left]>heap[big]){
            big=left;
        }
        if(right<this.size && heap[right]>heap[big]){
            big=right;
        }
        if(big!=idx){
            swap(this.heap,big,idx);
            sink(big);
        }
    }

    public void sort(){
        int n=this.size;
        for(int i=this.size-1;i>=0;i--){
            swap(this.heap,0,i);
            size--;
            sink(0);
        }
        this.size=n;
    }

    public int[] getHeap(){
        return this.heap;
    }
}
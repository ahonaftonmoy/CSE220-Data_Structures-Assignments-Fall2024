public class MinHeap{

    private int size;
    private int [] heap;

    MinHeap(int n){
        this.heap=new int[n];
    }

    public void insert(int key){
        if(this.size<this.heap.length){
            this.heap[this.size]=key;
            swim(this.size);
            this.size++;
        }
    }

    public void swim(int idx){
        if(idx<1){
            return;
        }
        int par=(idx-1)/2;
        if(this.heap[idx]<this.heap[par]){
            swap(this.heap,idx,par);
            swim(par);
        }
    }

    private void swap(int [] heap, int i1, int i2){
        int temp=this.heap[i1];
        this.heap[i1]=this.heap[i2];
        this.heap[i2]=temp;
    }

    public int extractMin(){
        if(this.size==0){
            return 0;
        }
        int min=heap[0];
        swap(this.heap,--this.size,0);
        sink(0);
        return min;
    }

    public void sink(int idx){
        int small=idx;
        int left=2*idx+1;
        int right=2*idx+2;

        if(left<this.size && heap[left]<heap[small]){
            small=left;
        }
        if(right<this.size && heap[right]<heap[small]){
            small=right;
        }
        if(small!=idx){
            swap(this.heap,small,idx);
            sink(small);
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
        int [] arr=new int[this.size];
        for(int i=0;i<this.size;i++){
            arr[i]=this.heap[i];
        }
        return arr;
    }
}
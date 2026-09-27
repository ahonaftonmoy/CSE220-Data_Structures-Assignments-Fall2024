public class Graph{
    int src;
    int dst;
    int wgt;
    Graph next;

    Graph(int src, int dst, int wgt){
        this.src=src;
        this.dst=dst;
        this.wgt=wgt;
        this.next=null;
    }
}
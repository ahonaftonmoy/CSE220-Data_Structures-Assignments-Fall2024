public class task4{
    
    //Adjacency matrix
    public static void print(int [][] g){
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                System.out.print(g[i][j]+" ");
            }
            System.out.println();
        }
    }

    //Adjacency List
    public static void print(Graph [] G){
        for(int i=0;i<G.length;i++){
            System.out.print(i+": ");
            Graph temp=G[i];
            if(temp==null){
                System.out.println();
                continue;
            }
            while(temp!=null){
                System.out.print("<"+temp.src+", "+temp.dst+", "+temp.wgt+"> -->");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    //task4a
    public static void Undirect(int [][] g){
        for(int r=0;r<g.length;r++){
            for(int c=0;c<g[0].length;c++){
                if(g[r][c]!=0){
                    g[c][r]=g[r][c];
                }
            }
        }
    }

    //task4b
    public static void Undirect(Graph[] G){
        for(int i=0;i<G.length;i++){
            Graph temp=G[i];
            while(temp!=null){
                insert(temp.dst,temp.src,temp.wgt,G);
                temp=temp.next;
            }
        }
    }

    public static void insert(int src, int dst, int wgt,Graph[] G){
        Graph ver=new Graph(src,dst,wgt);
        if(G[src]==null){
            G[src]=ver;
        }
        else{
            Graph temp=G[src];
            while(temp!=null){
                if(temp.dst==ver.dst){
                    return;
                }
                temp=temp.next;
            }
            ver.next=G[src];
            G[src]=ver;
        }
    }
    public static void main(String [] args){
        int[][] g=new int[7][7];
        task3.insert(0,1,5,g);
        task3.insert(0,2,6,g);
        task3.insert(0,3,7,g);
        task3.insert(0,4,8,g);
        task3.insert(0,5,9,g);
        task3.insert(0,6,10,g);
        task3.insert(1,2,11,g);
        task3.insert(1,3,12,g);
        task3.insert(1,4,13,g);
        task3.insert(1,5,14,g);
        task3.insert(1,6,15,g);
        task3.insert(2,3,16,g);
        task3.insert(2,4,17,g);
        task3.insert(3,4,18,g);
        task3.insert(4,5,19,g);
        task3.insert(5,6,20,g);
        System.out.println("Directed:");
        print(g);
        Undirect(g);
        System.out.println("Undirect:");
        print(g);

        Graph[] G=new Graph[7];
        insert(0,1,5,G);
        insert(0,2,6,G);
        insert(0,3,7,G);
        insert(0,4,8,G);
        insert(0,5,9,G);
        insert(0,6,10,G);
        insert(1,2,11,G);
        insert(1,3,12,G);
        insert(1,4,13,G);
        insert(1,5,14,G);
        insert(1,6,15,G);
        insert(2,3,16,G);
        insert(2,4,17,G);
        insert(3,4,18,G);
        insert(4,5,19,G);
        insert(5,6,20,G);
        System.out.println("Directed:");
        print(G);
        Undirect(G);
        System.out.println("Undirect:");
        print(G);
    }
}
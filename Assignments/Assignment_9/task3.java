public class task3{
    
    static int maxd=-1,max=-1;


    //Adjacency Matrix
    public static void insert(int src, int dst, int wgt, int [][] g){
        g[src][dst]=wgt;
    }

    //Adjacency List
    public static void insert(int src, int dst, int wgt, Graph[] G){
        Graph ver=new Graph(src,dst,wgt);
        if(G[src]==null){
            G[src]=ver;
        }
        else{
            Graph temp=G[src];
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=ver;
        }
    }

    //task3a-task1
    public static int maxOutDegA(int [][] g){
        int deg=0,idx=-1;
        for(int r=0;r<g.length;r++){
            deg=0;
            for(int c=0;c<g[0].length;c++){
                if(g[r][c]!=0){
                    deg++;
                }
            }
            if(deg>maxd){
                maxd=deg;
                idx=r;
            }
        }
        return idx;
    }

    //task3a-task2
    public static int max3a(int [][] g){
        int max=0,sum=0,idx=0;

        for(int r=0;r<g.length;r++){
            sum=0;
            for(int c=0;c<g[0].length;c++){
                sum+=g[r][c];
            }
            if(sum>max){
                max=sum;
                idx=r;
            }
        }
        return idx;
    }

    //task3b-task1
    public static int maxOutDegB(Graph[]G){
        int deg=0,idx=-1;
        for(int i=0;i<G.length;i++){
            deg=0;
            Graph temp=G[i];
            while(temp!=null){
                deg++;
                temp=temp.next;
            }
            if(deg>max){
                max=deg;
                idx=i;
            }
        }
        return idx;
    }

    //task3b-task2
    public static int max3b(Graph[]G){
        int max=0,sum=0,idx=0;

        for(int i=0;i<G.length;i++){
            sum=0;
            Graph temp=G[i];
            while(temp!=null){
                sum+=temp.wgt;
                temp=temp.next;
            }
            if(sum>max){
                max=sum;
                idx=i;
            }
        }
        return idx;
    }

    public static void main(String [] args){
        int[][] g=new int[7][7];
        insert(0,1,5,g);
        insert(0,2,6,g);
        insert(0,3,7,g);
        insert(0,4,8,g);
        insert(0,5,9,g);
        insert(0,6,10,g);
        insert(1,2,11,g);
        insert(1,3,12,g);
        insert(1,4,13,g);
        insert(1,5,14,g);
        insert(1,6,15,g);
        insert(2,3,16,g);
        insert(2,4,17,g);
        insert(3,4,18,g);
        insert(4,5,19,g);
        insert(5,6,20,g);
        System.out.println("Task 3a- "+maxOutDegA(g)+", "+maxd);
        System.out.println("Task 3a- "+max3a(g));

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
        System.out.println("Task 3b- "+maxOutDegB(G)+", "+max);
        System.out.println("Task 3b- "+max3b(G));
    }
}
//Assignment Task 03: Matrix Compression
class AssgnTask3{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer[][] compressMatrix( Integer[][] matrix ){

        Integer [][] newM= new Integer[matrix.length/2][matrix[0].length/2];
        Integer sum=0;
        int r=0,c=0;

        for(int i=0;i<matrix.length;i+=2){
            for(int j=0;j<matrix[0].length;j+=2){
                sum=matrix[i][j]+matrix[i+1][j]+matrix[i][j+1]+matrix[i+1][j+1];
                newM[r][c++]=sum;
                sum=0;    
            }
            r++;
            c=0;       
        }
        return newM;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}
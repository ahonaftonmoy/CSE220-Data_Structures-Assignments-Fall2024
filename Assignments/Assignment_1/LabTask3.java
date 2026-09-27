//Lab Task 03: Decryption Process
class LabTask3{

    //Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix( Integer[][] matrix ){

        int r=matrix.length,c=matrix[0].length,sum1=0,sum2=0;
        Integer [] arr1= new Integer [c];
        Integer [] arr2= new Integer [c-1];

        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                sum1+=matrix[j][i];
            }
            arr1[i]=sum1;
            sum1=0;
        }

        for(int k=1;k<arr1.length;k++){arr2[k-1]=arr1[k]-arr1[k-1];}
        return arr2;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}
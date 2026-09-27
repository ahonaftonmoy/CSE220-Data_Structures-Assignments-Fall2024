//Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {

    //===================================TASK#5======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
        return helper(root.left,root.right); 
    }

    private static Integer helper(BSTNode root1, BSTNode root2){
        if(root1==null || root2==null){
            return 0;
        }
        return root1.elem+root2.elem+helper(root1.left,root2.right)+helper(root1.right,root2.left);
    }
    //===============================================================


}

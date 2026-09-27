//Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {

    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Boolean isBST( BSTNode root ){
       return helper(root,null,null);
    }

    private static Boolean helper(BSTNode root,Integer more, Integer less){
        if(root==null){
            return true;
        }

        if(more!=null && less!=null){
            if(root.elem<more && root.elem>less){
                return helper(root.left,root.elem,less) && helper(root.right,more,root.elem);
            }
            else{
                return false;
            }
        }

        return helper(root.left,root.elem,less) && helper(root.right,more,root.elem);
    } 
    //===============================================================


}

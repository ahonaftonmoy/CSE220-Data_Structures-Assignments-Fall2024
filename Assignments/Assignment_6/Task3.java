//LAB TASK NO NEED TO SUBMIT
// Complete the sumTree method
public class Task3 {

        //===================================TASK#3===================================
        // This method takes only 1 parameter which is root of the given tree
        // This method returns an Integer
        // At times you may need to typeCast root.elem to Integer
        // You can use extra helper private static methods as per need
        public static Integer sumTree( BTNode root ){
            return helper(root,0);
        }

        public static Integer helper(BTNode root, int lvl){
            if(root==null){
                return 0;
            }
            Integer x=(Integer)root.elem;
            if(lvl!=0){
                x=(Integer)root.elem%lvl;
            }
            return helper(root.left, lvl+1)+x+helper(root.right,lvl+1);
        }    
        //============================================================================

}

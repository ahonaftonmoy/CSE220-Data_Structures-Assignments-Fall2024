// Complete the levelSum method
//ASSIGNMENT TASK MUST SUBMIT
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
        return lvlS(root,0);
    }

    private static Integer lvlS(BTNode root, int lvl){
        if(root==null){
            return 0;
        }
        Integer sum=-(Integer)root.elem;
        sum+=lvlS(root.left,lvl+1)+lvlS(root.right,lvl+1);
        if(lvl%2==0){
            sum-=2*(lvlS(root.left,lvl+1)+lvlS(root.right,lvl+1));
        }
        return sum;
    }
    //============================================================================

}

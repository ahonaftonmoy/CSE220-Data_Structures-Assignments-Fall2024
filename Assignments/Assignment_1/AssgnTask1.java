//Assignment Task 01: Container with Most Water
class AssgnTask1{

    public static void mostWater( Integer[] height ){
        int area=0, maxArea=0;

        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                if(height[j]<height[i]){area=(j-i)*height[j];}  
                else{area=(j-i)*height[i];}
                if(maxArea<area){maxArea=area;}                                                         
            }
        }

        System.out.println(maxArea);
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
	System.out.print("\nYour Output:\n");
        mostWater( array );

    }
}

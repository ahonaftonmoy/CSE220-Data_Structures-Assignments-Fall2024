public class AssignmentTask7 {

    //SUBMIT ONLY THIS METHOD    
    public static void rangeMove(DNode dh, int start, int end) {
        DNode temp=dh.next, temp2=dh.next;
        int last=(int)dh.prev.elem;
        while((int)temp.elem!=last){
            if((int)temp.elem>=start && (int)temp.elem<=end){
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;

                temp2=temp.next;
                
                dh.prev.next=temp;
                temp.prev=dh.prev;
                temp.next=dh;
                dh.prev=temp;
            }
            else{temp2=temp2.next;}
            temp=temp2;
        }
    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {5, 3, 7, 1, 9, 6, 2, 4};
        DNode dh = LinkedListHelpers.createDummyHeadedDoublyLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);

        System.out.println("\nExpected Output:");
        Object[] expected = {3, 1, 9, 2, 4, 5, 7, 6};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);
        
        //Running the Range Move with [5,7] range 
        rangeMove(dh, 5, 7);
        //Printing after Range Move
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);
    }
}

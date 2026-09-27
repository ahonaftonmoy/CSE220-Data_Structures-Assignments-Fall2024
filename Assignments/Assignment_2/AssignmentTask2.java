// AssignmentTask2: Sum of Nodes
public class AssignmentTask2 {
    
    // MUST SUBMIT this method

    public static Node nodeAt(Node head, int idx){
        Node temp=head;
        int c=0;
        while(temp!=null){
            if(idx==c){return temp;}
            c++;
            temp=temp.next;
        }
        return new Node(0);
    }
    public static int sumDist(Node head, Integer[] distArr) {
        int sum=0;
        for(int i=0;i<distArr.length;i++){
            sum+=(int)nodeAt(head, distArr[i]).elem;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{10, 16, -5, 9, 3, 4});
        Integer[] dist = new Integer[] {2, 0, 5, 2, 8};
	System.out.print("Given LinkedList: ");
	LinkedList.printLL(head1);
	System.out.print("Distance Array: ");
	Arr.print(dist);
        System.out.println("\nExpected Output: 4");
	int returnedValue = sumDist(head1, dist);
	System.out.println("Your Output: "+returnedValue); // This should print: Sum of Nodes: 4
    }
}

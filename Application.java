/* 
 * Gabriella Bruno
 * Lab 6
 * Title: Application.java
 * Description: uses methods to alter single linked list
 * Date: 10/19/25
 */
public class Application {
//testing example
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initialization
				IntLinkedList alist = new IntLinkedList();
				alist.addFirst(3);
				alist.addFirst(2);
				alist.addFirst(6);
				alist.addFirst(4);
				alist.addFirst(3);
				System.out.println(" constructed a list:");
				alist.traverse();
				
				//step 1: 
				System.out.println("\n step 1: get length");
				System.out.println("The length of this linkedList is " + alist.getLength());
				
				//step 2:
				System.out.println("\n step 2: add new item at the end");
				System.out.println("The original list is: ");
				alist.traverse();
				System.out.println("Add 5 at the end of the list: ");
				alist.addTail(5);
				alist.traverse();
				
				//step 3:
				System.out.println("\n step 3: finding item");
				System.out.print("Finding the first element contains 4: ");
				IntLinkedList.showContent(alist.findItem(4));
				System.out.println(" ");
				
				//step 4:
				System.out.println("\n step 4: finding maximum value");
				System.out.println("The original list is: ");
				alist.traverse();
				System.out.println("The max value of the list is: " + alist.maxValue());
				
				//scaleBy testing (already done for you)
				//take this as an example
				System.out.println("\n Example: scale");
				System.out.println("The original list is: ");
				alist.traverse();
				System.out.println("The new list, which is scaled by 4, is: ");
				IntLinkedList clist = alist.scaleBy(4);
				clist.traverse();
				
				//step 5:
				System.out.println("\n step 5: divisible");
				System.out.println("The original list is: ");
				alist.traverse();
				System.out.println("The new list, which is divisible by 3, is: ");
				IntLinkedList dlist = alist.divisibleBy(3);
				dlist.traverse();
				
				//step 6:
				System.out.println("\n step 6: reverse copy");
				IntLinkedList flist = clist.reverseCopy();
				System.out.println("The original list is: ");
				clist.traverse();
				System.out.println("The reversed list is: ");
				flist.traverse();
				
				//step 7:
				System.out.println("\n step 7: filtering");
				System.out.println("The original list is: ");
				alist.traverse();
				System.out.println("The new list is: ");
				IntLinkedList elist = alist.filter(3);
				elist.traverse();
				
	}//end main

}//end class

/*
 * console output:
 * 
 constructed a list:
3 ==> 4 ==> 6 ==> 2 ==> 3  

 step 1: get length
The length of this linkedList is 5

 step 2: add new item at the end
The original list is: 
3 ==> 4 ==> 6 ==> 2 ==> 3 
Add 5 at the end of the list: 
3 ==> 4 ==> 6 ==> 2 ==> 3 ==> 5 

 step 3: finding item
Finding the first element contains 4: 4 

 step 4: finding maximum value
The original list is: 
3 ==> 4 ==> 6 ==> 2 ==> 3 ==> 5 
The max value of the list is: 6

 Example: scale
The original list is: 
3 ==> 4 ==> 6 ==> 2 ==> 3 ==> 5 
The new list, which is scaled by 4, is: 
12 ==> 16 ==> 24 ==> 8 ==> 12 ==> 20 

 step 5: divisible
The original list is: 
3 ==> 4 ==> 6 ==> 2 ==> 3 ==> 5 
The new list, which is divisible by 3, is: 
3 ==> 6 ==> 3 

 step 6: reverse copy
The original list is: 
12 ==> 16 ==> 24 ==> 8 ==> 12 ==> 20 
The reversed list is: 
20 ==> 12 ==> 8 ==> 24 ==> 16 ==> 12 

 step 7: filtering
The original list is: 
3 ==> 4 ==> 6 ==> 2 ==> 3 ==> 5 
The new list is: 
4 ==> 6 ==> 2 ==> 5 
 * 
 */

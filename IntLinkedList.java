/* 
 * Gabriella Bruno
 * Lab 6
 * Title: IntLinkedList.java
 * Description: implements methods for a single linked list
 * Date: 10/19/25
 */
public class IntLinkedList {

	private Node head = null;
	private int size = 0;
	
	private static class Node {
		private int data;
		private Node next;
		
		private Node(int dataItem){
			data = dataItem;
			next = null;
		}
		
		private Node(int dataItem, Node nodeRef){
			data = dataItem;
			next = nodeRef;
		}

	}
	
	public void addFirst(int dataItem){
		head = new Node(dataItem, head);
		size++;
	}
	
	public void traverse(){
		Node currentnode = head;
		while(currentnode != null){
			System.out.print(currentnode.data);
			currentnode = currentnode.next;
			if (currentnode != null){
				System.out.print(" ==> ");
			}
		}
		System.out.println(" ");
	}
	
	public Node getNode(int index){
		if(index < 0 || index >= size){
			throw new ArrayIndexOutOfBoundsException(index);
		}
		Node currentnode = head;
		for(int i =0; i < index && currentnode != null; i++){
			currentnode = currentnode.next;
		}
		return currentnode;
	}
	
	public void add(int index, int dataItem){
		if(index < 0 || index > size){
			throw new ArrayIndexOutOfBoundsException(index);
		}
		if (index == 0){
			//insert at the head of the chain
			addFirst(dataItem);
		} else {
			Node prevnode = getNode(index-1);
			prevnode.next = new Node(dataItem, prevnode.next);
			size++;
		}
	}
	
	public void removeFirst(){
		Node targetnode = head;
		if (head != null){ 
			head = head.next;
		}
		if (targetnode != null){
			size--;
		}
	}
	
	public void remove(int index){
		if(index < 0 || index >= size){
			throw new ArrayIndexOutOfBoundsException(index);
		}
		if (index == 0){
			removeFirst();
		} else {
			Node prevnode = getNode(index-1);
			Node targetnode = prevnode.next;
			prevnode.next = targetnode.next;
			size--;		
		}
		
	}
	
	public static void showContent(Node nodeRef){
		if (nodeRef == null){
			System.out.print("null");
		} else{ 
			System.out.print(nodeRef.data);
		}
	}
	
	public int getLength(){
		//return size;
		int count = 0;
		Node currentNode = head;
		while (currentNode != null) {
			count++;
			currentNode = currentNode.next;
		}
		return count;
	}
	
	public void addTail(int dataItem){
		Node currentNode = head;
		if (size == 0) {
			head = new Node (dataItem, null);
		} else {
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = new Node (dataItem, null);
		}
		size++;
	}
	
	
	public Node findItem(int dataItem){
		Node find = null;
		Node currentNode = head;
		boolean found = false;
		
		while(currentNode != null) {
			if (currentNode.data == dataItem) {
				find = currentNode;
				found = true;
			}
			currentNode = currentNode.next;
		}
		
		if (found == true) {
			return find;
		} else {
			return null;
		}
	}
	
	public int maxValue(){
		Node max = head;
		Node currentNode = head;
		
		while (currentNode != null) {
			if (currentNode.data > max.data) {
				max = currentNode;
			}			
			currentNode = currentNode.next;
		}
		return max.data;
	}
	
	
	public IntLinkedList scaleBy(int n){
		Node currentnode = head;
		IntLinkedList copiedList = new IntLinkedList();
		while(currentnode != null){
			copiedList.addTail(currentnode.data*n);
			currentnode = currentnode.next;
		}
		return copiedList;
	}//take this as an example
	
	
	public IntLinkedList divisibleBy(int divisor){
		Node currentNode = head;
		IntLinkedList divideList = new IntLinkedList();
		
		while(currentNode != null){
			if (currentNode.data % divisor == 0) {
				divideList.addTail(currentNode.data);
			}
			currentNode = currentNode.next;
		}
		return divideList;
	}
	
	
	public IntLinkedList reverseCopy(){
		Node currentnode = head;
		IntLinkedList reverseList = new IntLinkedList();
		
		while (currentnode != null) {
			reverseList.addFirst(currentnode.data);
			currentnode = currentnode.next;
		}
		return reverseList;
	}
	
	
	public IntLinkedList filter(int n){
		Node currentnode = head;
		IntLinkedList filterList = new IntLinkedList();
		
		while(currentnode != null){
			if (currentnode.data != n) {
				filterList.addTail(currentnode.data);
			}
			currentnode = currentnode.next;
		}
		return filterList;
	}
	
}//end class

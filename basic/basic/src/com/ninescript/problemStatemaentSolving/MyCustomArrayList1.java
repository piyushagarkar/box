package com.ninescript.problemStatemaentSolving;

import java.util.Arrays;

/**
 * 
 * @author Piyush
 *
 */
class MyCustomArrayList {
	
	private static final int INITAL_CAPCITY=10;
	private Object elementData[]={};
	private int size =0;
	
	public MyCustomArrayList(){
		
		elementData = new Object[INITAL_CAPCITY];
	}
	
	public void add(Object e){
		if(size == elementData.length){
			ensureCapacity(); 
			
		}
			elementData[size++] = e;
		
	}
	
	private void ensureCapacity() {
		int newIncreasedCapacity = elementData.length * 2;
		elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
	}


	public Object get(int index) {
		
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
			
		}
			return (Object) elementData[index];
		
	}
	
		public Object remove(int index) {
		
			if (index < 0 || index >= size) { 
				throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
			}

			Object removedElement = elementData[index];
			for (int i = index; i < size; i++) {
				elementData[i] = elementData[i + 1];
			}
			size--; 

			return removedElement;
				
			
		}
		
		public void display() {
			
			System.out.println("Displaying List ");
			for(int i =0; i < size ; i++){
				System.out.print(elementData[i] + " ");
			}
			
			
		}
	
}	
 
 public class MyCustomArrayList1{
	

	public static void main(String... a) {
		MyCustomArrayList list = new MyCustomArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(null);

		list.display();
		System.out.println("\nElement at index " + 1 + " = " + list.get(1));
		System.out.println("\nElement removed from index " + 1 + " = " + list.remove(1));
		System.out.println("\nLet's display list again after removal at index 1");
		list.display();


	}


	
}	


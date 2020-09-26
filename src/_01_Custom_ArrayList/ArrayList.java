package _01_Custom_ArrayList;

import java.awt.List;

@SuppressWarnings("unchecked")

public class ArrayList <T> {
	T[] list;
	public ArrayList() {
		list = (T[]) new Object[0];
		
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		
		return list[loc];
	}
	
	public void add(T val) {
		T[] newList = (T[]) new Object[list.length+1];
		for(int i=0; i<list.length; i++) {
			newList[i]=list[i];
		}
		newList[newList.length-1]=val;
		list = newList;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] newList = (T[]) new Object[list.length+1];
		for(int i=0; i<list.length; i++) {
			newList[i]=list[i];
		}
		newList[loc]=val;
		list = newList;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		T[] newList = (T[]) new Object[list.length+1];
		for(int i=0; i<list.length; i++) {
			newList[i]=list[i];
		}
		newList[loc]=val;
		list = newList;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] newList = (T[]) new Object[list.length];
		int x=0;
		for(int i=0; i<list.length; i++) {
			if(i==loc) {
				x=x+1;
			}
			else if(x==0) {
			newList[i]=list[i];
		}
			else if(x==1) {
				newList[i-1]=list[i-1];
			}
			list = newList;
			
		}
		
		
	}
	
	public boolean contains(T val) {
		T[] newList = (T[]) new Object[list.length];
		for(int i=0; i<list.length; i++) {
			if(newList[i] != val) {
				return false;
			}
		}
		return true;
	}
}
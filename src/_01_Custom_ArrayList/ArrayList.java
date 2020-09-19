package _01_Custom_ArrayList;

import java.awt.List;

@SuppressWarnings("unchecked")

public class ArrayList <T> {
	T[] list;
	public ArrayList() {
		list = (T[]) new Object[0];
		
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		
		return ;
	}
	
	public void add(T val) {
		T[] newList = (T[]) new Object[list.length+1];
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}
package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T> {
	T[] i;
	public ArrayList() {
		i = (T[]) new Object[1];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		
		return i[loc];
	}
	
	public void add(T val) {
		
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
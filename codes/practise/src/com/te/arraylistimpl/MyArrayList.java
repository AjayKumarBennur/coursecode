package com.te.arraylistimpl;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList {
	Object[] array;
	int arraySize;
	int position;

	MyArrayList(int arraySize) {
		array = new Object[arraySize];
		this.arraySize= arraySize-1;
	}

	public void add(Object o) {
		if (position > arraySize) {
			increaseCapacity();
		}
		array[position] = o;
		position++;
	}

	private void increaseCapacity() {
		Object[] temp = new Object[((array.length * 3)/2)+1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		arraySize=array.length;
		array = temp;
	}
	
	public Object get(int index) {
		return array[index];
	}
	
	public void remove(int index) {
		for(int i = index;i<position;i++) {
			array[i]=array[i+1];
		}
		position--;
	}

	@Override
	public String toString() {
		String s = "["+array[0];
		for(int i = 1;i<position;i++) {
			s+=","+array[i];
		}
		s+="]";
		return s;
	}
	
	public Iterator iterator() {
		return new MyItr();
	}
	
	private class MyItr implements Iterator{
		
		int index;
		
		@Override
		public boolean hasNext() {
			return (index<position)?true:false;
		}

		@Override
		public Object next() {
			Object obj = array[index];
			index++;
			return obj;
		}

		
		
	}
}

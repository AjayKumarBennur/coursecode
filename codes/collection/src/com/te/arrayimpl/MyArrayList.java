package com.te.arrayimpl;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList implements Iterable {

	Object[] array;
	int arraysize;
	private int position;

	public MyArrayList(int arraysize) {
		array = new Object[arraysize];
	}

	public void add(Object o) {
		if (position > arraysize) {
			increaseCapacity();
		}
		array[position] = o;
		position++;
	}

	private void increaseCapacity() {
		Object[] temp = new Object[array.length + 3];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		array = temp;
	}

	public Object get(int index) {
		return array[index];
	}

	public void remove(int index) {
		for (int i = index + 1; i < array.length; i++) {
			array[i - 1] = array[i];
		}
		position--;
	}

	@Override
	public String toString() {
		String s = "[" + array[0];
		for (int i = 1; i < position; i++) {
			s += "," + array[i];
		}
		s += "]";
		return s;
	}

	@Override
	public Iterator iterator() {
		return new MyItr();
	}

	private class MyItr implements Iterator {

		int index;

		@Override
		public boolean hasNext() {
			return (index < position) ? true : false;
		}

		@Override
		public Object next() {
			Object e = (Object) array[index];
			index++;
			return e;
		}

	}
}

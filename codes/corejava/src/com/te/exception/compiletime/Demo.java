package com.te.exception.compiletime;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("file.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

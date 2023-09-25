package Tutorials;

import java.util.ArrayList;
import java.util.List;

public class VectorTesting {

	public static void main(String[] args) {
		// vector is a part of java (is a collection of objects)

		int size = 1000000;

		// different between Vector and ArrayList
		List<Integer> list = new ArrayList<>();
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < size; i++) {
			list.add(i);
		}

		long endTime = System.currentTimeMillis();

		System.out.println("Added " + size + " elements to ArrayList: " + (endTime - startTime) + "ms");
	}

}

package Tutorials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorTesting {

	public static void main(String[] args) {
		// vector is a part of java (is a collection of objects)

		int size = 1000000;

		// different between Vector and ArrayList
		// this is an ArrayList
		List<Integer> list = new ArrayList<>();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			list.add(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Added " + size + " elements to ArrayList: " + (endTime - startTime) + "ms");

		// create a Vector
		List<Integer> vector = new Vector<>();
		startTime = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			vector.add(i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Added " + size + " elements to Vector: " + (endTime - startTime) + "ms");

		// create a Thread with Array List
		List<Integer> multiThreadList = Collections.synchronizedList(new ArrayList<>());
		startTime = System.currentTimeMillis();
		Thread tr1 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multiThreadList.add(i);
			}
		});

		Thread tr2 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multiThreadList.add(i);
			}
		});
		tr1.start();
		tr2.start();
		endTime = System.currentTimeMillis();
		System.out.println("Added " + size + " elements to Thread with ArrayList: " + (endTime - startTime) + "ms");

		// create a Thread with Vector
		List<Integer> multiThreadVector = new Vector<>();
		startTime = System.currentTimeMillis();
		tr1 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multiThreadVector.add(i);
			}
		});

		tr2 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multiThreadVector.add(i);
			}
		});
		tr1.start();
		tr2.start();
		endTime = System.currentTimeMillis();
		System.out.println("Added " + size + " elements to Thread with Vector: " + (endTime - startTime) + "ms");
	}

}

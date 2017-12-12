package hu.helixlab;

import java.util.Random;

public class ArrayWrapper implements Printable {

	int[] array;
	
	public ArrayWrapper(int arraySize) {
		init(arraySize);
	}
	
	public ArrayWrapper() {
		init(5);
	}

	@Override
	public void print() {
		for (int cell : array) {
			System.out.print(cell + "\t");
		}
		System.out.println();
		
	}
	
	private void init (int arraySize) {
		Random random = new Random();
		array = new int[arraySize];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(Integer.MAX_VALUE);
		}
	}

}

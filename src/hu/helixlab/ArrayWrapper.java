package hu.helixlab;

import java.text.DecimalFormat;
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
		DecimalFormat df = new DecimalFormat("0000000000");
		for (int i = 0; i < array.length; i++) {
			System.out.print(df.format(array[i]) + "\t");
			if (i > 0 && i % 20 == 0) {
				System.out.println();
			}
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

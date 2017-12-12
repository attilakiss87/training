package hu.helixlab;

import java.util.Random;

public class MatrixWrapper implements Printable {

	private int[][] matrix;
	
	public MatrixWrapper(int rows, int cols) {
		init(rows, cols);
	}
	
	public MatrixWrapper() {
		init(5, 5);
	}
	
	@Override
	public void print() {
		if (this.matrix != null) {
			for (int i = 0; i < matrix.length; i++) {
				for (int cell : matrix[i]) {
					System.out.print(cell + "\t");
				}
				System.out.println();
			}
		}
		
	}
	
	private void init (int rows, int cols) {
		Random random = new Random();
		matrix = new int[rows][cols];
		for (int rowNum = 0; rowNum < matrix.length; rowNum++) {
			for (int colNum = 0; colNum  < matrix[rowNum].length; colNum++) {
				matrix[rowNum][colNum] = random.nextInt(Integer.MAX_VALUE);
			}
		}
	}

}

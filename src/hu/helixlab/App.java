package hu.helixlab;

public class App {

	public static void main(String[] args) {
		
		Printable[] ifaceArray = new Printable[6];
		ifaceArray[0] = new MatrixWrapper();
		ifaceArray[1] = new MatrixWrapper(150, 15);
		ifaceArray[2] = new ArrayWrapper();
		ifaceArray[3] = new MatrixWrapper(2, 2);
		ifaceArray[4] = new ArrayWrapper(8);
		ifaceArray[5] = new ArrayWrapper(10000);
		
		for (Printable p : ifaceArray) {
			p.print();
			System.out.println();
		}

	}
	
}

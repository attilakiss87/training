package hu.helixlab;

public class Name extends BaseClass {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Én meg vagyok a leszármazott osztály. Yippee ki-yay, motherfucker!");
		System.out.println(this.id);
	}
	
	
	
}

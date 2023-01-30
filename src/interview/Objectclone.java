package interview;

public class Objectclone {
	int a;

	Objectclone(int a) {
		this.a = a;
		// System.out.println(a);
	}

	void display() {
		System.out.println(a);
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Objectclone o = new Objectclone(34);
			o.display();
			Objectclone oo = (Objectclone) o.clone();
			oo.display();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

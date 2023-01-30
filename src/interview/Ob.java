package interview;

class Test implements Cloneable{
	int id;
	String name;
	public Test (int id , String name) {
		this.id =id;
		this.name =name;
	}
		void display () {
			System.out.println("id is :"+id);
			System.out.println("name is :"+name);
		}

public class Ob {
	public static void main (String [] args) throws CloneNotSupportedException
	{
		Test t = new Test (101,"Shree");
		Test T =(Test) t.clone();
		//hfgfgfg
		t.display();
		T.display();
		
	}
}
}

package feb25;

public class User {

	public static void main(String[] args) {
		Lenovo lenovo=new Lenovo();
		lenovo.copy();
		lenovo.paste();
		lenovo.cut();
		lenovo.keyboard();
		lenovo.capture();
		
		HP hp=new HP();
		hp.printing();
		//until java 7
		lenovo.security();
		Laptop.audio();

	}

}

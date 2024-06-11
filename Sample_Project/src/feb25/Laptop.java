package feb25;

public interface Laptop {
	
	public void copy();
	
	public void paste();
	
	public void cut();
	
	public void keyboard();
	
	default void security() {
		commoncode();
		System.out.println("Laptop secutity code");
	}
	static void audio() {
		commoncode();
		System.out.println("Laptop audio code");
	}
	private static void commoncode() {
		System.out.println("common code");
	}

}

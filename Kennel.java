
public class Kennel {
	
	static void KennelMethod() {
		Dog D1 = new Dog();
		Dog D2 = new Dog();
		Dog D3 = new Dog();
		
		D1.setDName("Sonic");
		D1.setDAge(1);
		D1.convertAge();
		
		D2.setDName("Kenji");
		D2.setDAge(2);
		D2.convertAge();
		
		D3.setDName("Lexi");
		D3.setDAge(7);
		D3.convertAge();
		
		System.out.println(D1.toString());
		System.out.println(D2.toString());
		System.out.println(D3.toString());
	}

	public static void main(String[] args) {
		KennelMethod();
		
	}

}

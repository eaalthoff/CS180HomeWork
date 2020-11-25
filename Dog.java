
public class Dog {
	//initialize
	private String DName;
	private int DAge;
	private int PDAge;
	//constructor
	public Dog (){
		DName="Rufus";
		DAge=0;
	}
	//setter
	public void setDName(String DName) {
		this.DName=DName;
		
	}
	public void setDAge(int DAge) {
		this.DAge=DAge;
	}
	//getter
	public String getDName() {
		return DName;
	}
	public int getDAge() {
		return DAge;
	}
	//age converter method
	public int convertAge() {
		PDAge=DAge*7;
		return PDAge;
	}
	public String toString() {
		String DogDesc="The dog's name is " + DName + ". They are " + DAge + " in dog years and " + PDAge + " in human years.";
		return DogDesc;
	}
	
}

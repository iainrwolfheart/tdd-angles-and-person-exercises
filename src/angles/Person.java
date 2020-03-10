package angles;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String niNumber;

	public Person(String firstName, String lastName, int age, String niNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.niNumber = niNumber;
	}
	
	public boolean equals(Person other) {
		if (other == null) return false;
		if (this.niNumber == other.niNumber) return true;
		else return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if (obj == null) result = false;
		
		if (obj instanceof Person) result = equals((Person) obj);
		
		else result = false;
		
		return result;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	} 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNiNumber() {
		return niNumber;
	}
	public void setNiNumber(String niNumber) {
		this.niNumber = niNumber;
	}

}

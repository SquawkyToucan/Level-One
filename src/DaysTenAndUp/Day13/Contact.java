package DaysTenAndUp.Day13;

public class Contact {
	String name;
	int number;
	String email;
	String category;
	Contact (int number, String name, String email, int organized) {
		this.name = name;
		this.email = email;
		this.number = number;
	}
	public void setPhone(int number) {
		this.number = number;
	}
	public void setEMail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void info() {
		System.out.println("Name: " + this.name);
		System.out.println("Number: " + this.number);
		System.out.println("E-Mail: " + this.email);
		System.out.println("This person is in the category " + category);
	}
	public static void main(String[] args) {
		Contact one = new Contact(4148293, "Juli Oh", "jm92014@yahoo.com", 0);
		one.setCategory("Family");
		one.info();
	}
}
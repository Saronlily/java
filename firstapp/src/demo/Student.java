package demo;

public class Student {
	public String firstName;
	public String lastName;
	public String email;
	public int age;

	
	public void display() {
		System.out.println("First name =  "+ firstName);
		System.out.println("Last name =  " +lastName);
		System.out.println("Email =  " +email);
		System.out.println("Age =  " +age);
	}
	
	
	public static void main(String[] args) {
		Student s1= new Student();
		s1.firstName="lily";
		s1.lastName="nadar";
		s1.email="s@gmail.com";
		s1.age=21;
		s1.display();
		Student s2=new Student();
		s2.firstName="lisa";
		s2.lastName="nadar";
		s2.email="n@gmail.com";
		s2.age=22;
		s2.display();
		
	}

}

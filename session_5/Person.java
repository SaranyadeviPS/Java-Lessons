package session_5;

public class Person {
private String name;
private int age;

//Regular constructor
public Person(String name, int age) {
	this.name = name;
	this.age = age;
	
}
//copy constructor
public Person(Person other) {
	this.name=other.name;
	this.age=other.age;
}

public String getName() {
	return name;
}
public int getAge() {
	return age;
}


public void displayInfo() {
	System.out.println("Name:"+name+",Age:"+age);
	
}
public static void main(String[] args) {
	
}
}

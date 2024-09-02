import java.util.* ;
import java.io.*; 
class Person {
	
	// Complete the class
	private String name;
	private int age;
	public void setValue(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void getValue(){
		System.out.print("The name of the person is "+name+" and the age is "+age+ ".");
	}
}

class Solution {
	
	public static void main(String args[]) {
		
		// Write your code here
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		Person p = new Person();
		p.setValue(name, age);
		p.getValue();

	}
}

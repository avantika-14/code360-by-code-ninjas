import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class ComplexNumbers {
	
	// Write your code here
	private int real;
	private int imaginary;

	public ComplexNumbers(int real,int imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	public void plus(ComplexNumbers c){
		this.real += c.real;
		this.imaginary += c.imaginary;
	}
	public void multiply(ComplexNumbers c){
		int updatedReal = (this.real * c.real) - (this.imaginary * c.imaginary);
		int updatedImaginary = (this.real * c.imaginary) + (this.imaginary * c.real);
		this.real = updatedReal;
		this.imaginary = updatedImaginary;
	}
	public void print(){
		System.out.print(this.real+" + i"+this.imaginary);
	}
}

class Solution {
	
	public static void main(String args[]) {
		
		// Write your code here
		Scanner sc = new Scanner(System.in);
	    int r1, i1;
		int r2, i2;
		r1 = sc.nextInt();
		i1 = sc.nextInt();
		r2 = sc.nextInt();
		i2 = sc.nextInt();
		ComplexNumbers c1 = new ComplexNumbers(r1, i1);
		ComplexNumbers c2 = new ComplexNumbers(r2, i2);
		int op = sc.nextInt();
		if(op == 1){
			c1.plus(c2);
			c1.print();
		}
		else if(op == 2){
			c1.multiply(c2);
			c1.print();
		}
	}
}
		

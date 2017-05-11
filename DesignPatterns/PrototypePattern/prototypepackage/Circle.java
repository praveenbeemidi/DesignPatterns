package prototypepackage;

public class Circle extends Shape {
	public Circle(){
		type="Rectangle";
	}
	
	public void draw(){
		System.out.println("Inside Circle::draw() method");
	}

}

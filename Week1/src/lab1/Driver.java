package lab1;

public class Driver {
	
	public static void main(String [] args) {
		Rectangle rect1= new Rectangle(4);
		rect1.setHeight(4);
		rect1.setWidth(5);
		System.out.println(rect1.toString());
		
		Circle cir1= new Circle(0);
		cir1.setRadius(5);
		System.out.println(cir1.toString());
		
		Ellipse eli1= new Ellipse(0);
		eli1.setHeight(5);
		eli1.setWidth(6);
		System.out.println(eli1.toString());
	}
}

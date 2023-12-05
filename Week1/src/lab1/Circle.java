package lab1;

public class Circle extends Shape{
	private double radius;
	
	public void setRadius(int radius) {
		this.radius= radius;
	}
	
	public double getRadius() {
		return radius;
	}

	Circle(int sides) {
		super(sides);
	}
	
	/*
	 * Return the area of circle in integer form.
	 */
	public double getArea() {
		return (Math.PI * radius * radius);
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + getRadius() + "  sides="+getSides()+ "  area="+getArea()+ "]";
	}
}

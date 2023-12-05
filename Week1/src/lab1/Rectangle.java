package lab1;

public class Rectangle extends Shape{
	private int height;
	private int width;

	public Rectangle(int sides) {
		super(sides);
		
	}
	
	public void setHeight(int height) {
		this.height= height;
	}
	public void setWidth(int width) {
		this.width= width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	@Override
	public double getArea() {
		return height * width;
	}
	
	@Override
	public String toString() {
		return "Rectangle [height=" + getHeight() + ", width=" + getWidth() +", sides="+getSides()+ ", area="+getArea()+"]";
	}
}

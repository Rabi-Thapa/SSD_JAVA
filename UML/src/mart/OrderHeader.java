package mart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import uml.Item;

public class OrderHeader {
	private String orderId;
	private Date orderDate;
	private double deliveryFee;
	DeliveryPriority priority;
	
	List<OrderLine> ordline= new ArrayList();
	
	OrderHeader(Customer customer){}
	
	public void addLine(Item item, int quantity) {}
	
	public boolean hasRestrictedItems() {
		return false;
	}
}

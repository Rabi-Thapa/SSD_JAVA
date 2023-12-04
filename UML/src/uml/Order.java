package uml;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private Date date;
	private String status;
//	OrderDetail ordDet;
	private List<OrderDetail> order= new ArrayList();
	
	public void calcSubTotal() {};
	public void calcTax() {};
	public void calcTotal() {};
	public void totalWeight() {};
}

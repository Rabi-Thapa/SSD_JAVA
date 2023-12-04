package mart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {
	private String customerid;
	private String name;
	private String emailAddress;
	private Address address;
	private Date dateOfBirth;
	private final int age;
	
	private List<OrderHeader> orderhead= new ArrayList();
	
	Customer(Address ad, Date dateOfBirth, Date currentDate){
		this.age= currentDate.compareTo(dateOfBirth);
		this.address= ad;
	}
}

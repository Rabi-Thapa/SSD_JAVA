package polymorph;

public class StaffMember {
	protected String name;
	protected String address;
	protected String phone;
	
	// ----------------------------------------------------------------------
	// constructor: Sets up this staff member using the specified information.
	// -----------------------------------------------------------------------
	
	public StaffMember(String eName, String eAddress, String ePhone) {
		name= eName;
		address= eAddress;
		phone= ePhone;
	}
}

package polymorph;

public class Staff {
	private StaffMember[] staffList;
	
	public Staff() {
		staffList= new StaffMember[6];
		staffList[0]= new Executive("Tony", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
		staffList[1]= new Employee("Paulie", "456 Off Line", "555-0101", "987-65-4321", 1245.15);
		staffList[2]= new Employee("Vito", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
		staffList[3]= new Hourly("Michael", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
	}
	
}

package API;


public class LeadCreate {
	
	public static PoJoLead lead() {
		
		PoJoLead createLeadinput=new PoJoLead();
		createLeadinput.setFirstName("Shilviya");
		createLeadinput.setLastName("Jayaraj");
		createLeadinput.setCompany("TestLeaf");	
        return createLeadinput;
	}

}

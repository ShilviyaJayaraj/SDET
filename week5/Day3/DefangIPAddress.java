package week5.Day3;

public class DefangIPAddress {
	@Test
	public void positive() {
		String address= "1.1.1.1";
		defangIP(address);
	}
	@Test
	public void edge() {
		String address= "255.100.50.0";
		defangIP(address);
	}
	@Test
	public void negative() {
		String address= "....";
		defangIP(address);
	}
	
	private void defangIP(String address) {
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<address.length();i++) {
			if(address.charAt(i)=='.') {
				sb.append("[.]");
			}
			else {
				sb.append(address.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}

package PrototypeDesignPattern;

public class Driver {

	public static void main(String[] args) {
		Prototype p=new Router("Router A", "192.168.1.1", "Firewall Enabled");
		Prototype newP=p.clone();
		
		p.display();
	
		newP.display();
		
	
	}

}

package ObserverDesignPattern;

public class Main {

	public static void main(String[] args) {
		Subject s= new Subject();
		iObserver res=new Resturant();
		iObserver cus=new Customer();
		iObserver dp=new DeliveryPatner();
		
		s.register(res);
		s.register(dp);
		s.register(cus);
		s.notifyAll("order placed , order num 101");
		s.unregister(dp);
		s.notifyAll("order placed , order num 101");

	}

}

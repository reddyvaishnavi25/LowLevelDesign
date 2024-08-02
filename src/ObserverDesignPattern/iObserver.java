package ObserverDesignPattern;

public interface iObserver {
  public void notify(String status);
}

class DeliveryPatner implements iObserver
{
	@Override
	public void notify(String status) {
		System.out.println("DP "+ status);
	}
}

class Customer implements iObserver
{
	@Override
	public void notify(String status) {
		System.out.println("Customer "+ status);
	}
}

class Resturant implements iObserver
{
	@Override
	public void notify(String status) {
		System.out.println("Resturant "+ status);
	}
}
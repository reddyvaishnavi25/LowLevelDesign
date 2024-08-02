package TemplateDesignPattern;

public abstract class Delivery {
	 public final void processOrder()
	 {
		verifyOrder();
		assignDP();
		trackOrder();
	 }
	 public abstract void verifyOrder();
	 public abstract void assignDP();
	 public abstract void trackOrder();
	 
}

class LocalDelivery extends Delivery{

	@Override
	public void verifyOrder() {
		System.out.println("verifying local order");
	}

	@Override
	public void assignDP() {
		System.out.println("assigning dp to local order");
	}

	@Override
	public void trackOrder() {
		System.out.println("tracking local order");
	}
	
}

class InternationalDelivery extends Delivery{

	@Override
	public void verifyOrder() {
		System.out.println("verifying international order");
	}

	@Override
	public void assignDP() {
		System.out.println("assiging dp to intl order");
	}

	@Override
	public void trackOrder() {
		System.out.println("tracking intl order");
	}
	
}
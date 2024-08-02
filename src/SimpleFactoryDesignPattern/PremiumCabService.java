package SimpleFactoryDesignPattern;

public class PremiumCabService implements iCabService{

	@Override
	public void booking()
	{
		System.out.println("booked premium service");
	}
}

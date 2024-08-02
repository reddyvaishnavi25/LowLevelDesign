package SimpleFactoryDesignPattern;

public class SharedCabService implements iCabService{

	@Override
	public void booking()
	{
		System.out.println("booked shared service");
	}
}

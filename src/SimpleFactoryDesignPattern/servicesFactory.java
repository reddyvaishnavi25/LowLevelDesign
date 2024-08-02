package SimpleFactoryDesignPattern;

public class servicesFactory {
//the function of this method is to create appropriate objects and return interface type of the obj
	public static iCabService createService(String input)
	{
		iCabService cabService=null;
		if(input.equals("single"))
			return new SingleCabService();
		else if(input.equals("shared"))
			return new SharedCabService();
		else if(input.equals("premium"))
			return new PremiumCabService();
		return cabService;		
	}
}
//main->factory-> iCabService->single
//main->factory-> iCabService->shared
//main->factory-> iCabService->premium
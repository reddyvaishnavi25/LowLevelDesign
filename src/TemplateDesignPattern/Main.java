package TemplateDesignPattern;

public class Main {
public static void main(String[] args)
{
	Delivery local=new LocalDelivery();
	local.processOrder();
	
	Delivery intl=new InternationalDelivery();
	intl.processOrder();
	
	
}
}

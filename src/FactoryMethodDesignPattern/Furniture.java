package FactoryMethodDesignPattern;

interface FurnitureItem{
	void display();
}

class Table implements FurnitureItem{	
	@Override
	public void display()
	{
		System.out.println("Table manufactured");
	}
}

class Sofa implements FurnitureItem{	
	@Override
	public void display()
	{
		System.out.println("Sofa manufactured");
	}
}

class Chair implements FurnitureItem{	
	@Override
	public void display()
	{
		System.out.println("Chair manufactured");
	}
}

interface FurnitureFactory{
	FurnitureItem createFurniture();
}

class SofaFactory implements FurnitureFactory{
	@Override
	public FurnitureItem createFurniture()
	{
		return new Sofa();
	}
}

class TableFactory implements FurnitureFactory{
	@Override
	public FurnitureItem createFurniture()
	{
		return new Table();
	}
}

class ChairFactory implements FurnitureFactory{
	@Override
	public FurnitureItem createFurniture()
	{
		return new Chair();
	}
}

class Client{
	public static FurnitureItem creater()
	{
		FurnitureFactory factory=new TableFactory();
		return factory.createFurniture();
		
	}
}
public class Furniture {
public static void main(String args[])
{
	FurnitureItem item=Client.creater();
	item.display();
}
}

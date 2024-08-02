package AbstractFactoryDesignPattern;

import java.util.Scanner;

interface iStarter{
	void display();
}
interface iMain{
	void display();
}
interface iDessert{
	void display();
}

class vegStarter implements iStarter{
	@Override
	public void display() {
		System.out.println("veg starter");
	}
}
class nonvegStarter implements iStarter{
	@Override
	public void display() {
		System.out.println("non veg starter");
	}
}
class vegMainCourse implements iMain{
	@Override
	public void display() {
		System.out.println("veg main");
	}
}
class nonvegMainCourse implements iMain{
	@Override
	public void display() {
		System.out.println("non veg main");
	}
}
class vegDessert implements iDessert{
	@Override
	public void display() {
		System.out.println("veg dessert");
	}
}
class nonvegDessert implements iDessert{
	@Override
	public void display() {
		System.out.println("non veg dessert");
	}
}
interface iCusine{
	iStarter selectStarter();
	iMain selectMainCourse();
	iDessert selectDessert();
}
class vegCusine implements iCusine{
	@Override
	public iStarter selectStarter() {
		return new vegStarter();
	}
	@Override
	public iMain selectMainCourse() {
		return new vegMainCourse();
	}
	@Override
	public iDessert selectDessert() {
		return new vegDessert();
	}
}
class nonvegCusine implements iCusine{
	@Override
	public iStarter selectStarter() {
		return new nonvegStarter();
	}
	@Override
	public iMain selectMainCourse() {
		return new nonvegMainCourse();
	}
	@Override
	public iDessert selectDessert() {
		return new nonvegDessert();
	}
}

class Client{
	public static iCusine Menu(String input)
	{
		if(input.equals("veg"))
		{
			return new vegCusine();
		}
		else if(input.equals("non veg"))
		{
			return new nonvegCusine();
		}
		return null;
	}
}
public class Resturant {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("select the cusine");
	String input=sc.nextLine();
	iCusine cusine=Client.Menu(input);
	iDessert item= cusine.selectDessert();
	item.display();
}
}

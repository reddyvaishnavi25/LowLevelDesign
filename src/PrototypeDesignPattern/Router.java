package PrototypeDesignPattern;

public class Router implements Prototype{

	 private String name;
	 private String ip;
	 private String securityPolicy;
	 public Router(String name, String ip, String securityPolicy )
	 {
		 this.name=name;
		 this.ip=ip;
		 this.securityPolicy=securityPolicy;
	 }
	 
	@Override
	public Prototype clone()
	{
		return new Router(name,ip,securityPolicy);
	}
	
	@Override
	public void display()
	{
		System.out.println(this.name + " "+ this.ip+" "+ this.securityPolicy);
	}
}

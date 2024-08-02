package IteratorDesignPattern;

public class Main {
public static void main(String[] args)
{
	Aggregate Amazon=new Aggregate();
	Product p1=new Product("Cetaphil" , 15.99, 5);
	Product p2=new Product("Gummies" , 12.99, 2.5);
	Product p3=new Product("Serum" , 10.82, 5);
	Product p4=new Product("RoseMary" , 9.99, 3.2);
	Product p5=new Product("Amlactin" , 17.99, 2.8);
	Product p6=new Product("Bengey" , 6.99, 3.6);
	Product p7=new Product("Cap" , 2.99, 3.5);
	Product p8=new Product("Shoe" , 105.99, 4.5);
	
	Amazon.addProduct(p1); Amazon.addProduct(p2); Amazon.addProduct(p3); Amazon.addProduct(p4);
	Amazon.addProduct(p4);Amazon.addProduct(p5);Amazon.addProduct(p6);Amazon.addProduct(p7);
	Iterator priceBasedIter= Amazon.createiterate("price");
	System.out.println(priceBasedIter.first().getName());
	System.out.println("sorted based on price");
	
	while(priceBasedIter.hasNext())
	{
		Product p=priceBasedIter.next();
		System.out.println(p.getName() + " " + p.getPrice());
	}
	
	
	Iterator ratingBasedIter= Amazon.createiterate("rating");
	System.out.println("sorted based on rating");
	
	while(ratingBasedIter.hasNext())
	{
		Product p=ratingBasedIter.next();
		System.out.println(p.getName() + " " + p.getRating());
	}
}
}

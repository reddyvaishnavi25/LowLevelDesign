package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Aggregate {
private List<Product> inventory=new ArrayList<>();

public void addProduct(Product p)
{
	inventory.add(p);
}

public Iterator createiterate(String option)
{
	if(option.equals("price"))
		return new priceIterator(inventory);
	else if(option.equals("rating"))
		return new ratingIterator(inventory);
	return null;
}

}

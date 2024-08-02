package IteratorDesignPattern;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public interface Iterator {
public Product next();
public Product first();
public boolean hasNext();
}

class priceIterator implements Iterator{
    
	private List<Product> products;
    private int index;
	public priceIterator(List<Product> products)
	{
		this.products=products;
		this.index=0;
		Collections.sort(this.products, Comparator.comparingDouble(Product::getPrice));
	}
	
	@Override
	public Product next() {
		if (hasNext()) {
            return products.get(index++);
        }
        return null;
	}

	@Override
	public Product first() {
		index=0;
		if(products.get(0)!=null)
			return products.get(index);
		else
			return null;
	}

	@Override
	public boolean hasNext() {
		if(index<products.size())
			return true;
		else
			return false;
	}
	
}

class ratingIterator implements Iterator{
    private List<Product> products;
    private int index;
	public ratingIterator(List<Product> products)
	{
		this.products=products;
		this.index=0;
		Collections.sort(this.products, Comparator.comparingDouble(Product::getRating).reversed());
	}
	@Override
	public Product next() {
		if (hasNext()) {
            return products.get(index++);
        }
        return null;
	}

	@Override
	public Product first() {
		index=0;
		if(products.get(0)!=null)
			return products.get(index);
		else
			return null;
	}

	@Override
	public boolean hasNext() {
		if(index<products.size())
			return true;
		else
			return false;
		
	}
	
}
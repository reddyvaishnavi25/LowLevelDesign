package IteratorDesignPattern;

public class Product {
private String name;
private double rating;
double price;
public Product(String name, double price, double rating) {
	super();
	this.name = name;
	this.rating = rating;
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}

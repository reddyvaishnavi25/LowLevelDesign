package SimpleFactoryDesignPattern;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
       System.out.println("what service you want");
       String input=sc.next();
       
       iCabService serviceType=servicesFactory.createService(input);
       serviceType.booking();
       
	}

}

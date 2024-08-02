package SingleTonDesignPattern;

public class Main {
public static void main(String args[])
{
	TVSet t1= TVSet.getInstance();
	TVSet t2=  TVSet.getInstance();
	
	System.out.println(t1);
	System.out.println(t2);
}
}

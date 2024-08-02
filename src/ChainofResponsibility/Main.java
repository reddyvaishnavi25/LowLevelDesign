package ChainofResponsibility;

public class Main {

	public static void main(String[] args) {
		Request r1=new Request("low");
		Request r2=new Request("medium");
		Request r3=new Request("high");
		
		Handler one=new LevelOneHandler(new LevelTwoHandler(new LevelThreeHandler(null)));
		
		one.process(r1);
		one.process(r2);
		one.process(r3);
		
//		Handler two=new LevelTwoHandler();
//		Handler three=new LevelThreeHandler();
		
		
		
		
	}

}

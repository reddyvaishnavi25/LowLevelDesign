package CommandDesignPattern;

public class Main {

	public static void main(String[] args) {
		iReceiver myDoc=new GoogleDocs("Leetcode God");
		iReceiver mySheet=new GoogleSheet("Leetcode Tracker");
		
		iCommand open=new OpenCommand(mySheet);
		iCommand close=new CloseCommand(mySheet);
		
		iCommand open1=new OpenCommand(myDoc);
		iCommand close1=new CloseCommand(myDoc);
		
		Invoker invoke=new Invoker();
		invoke.addCommand(open);
		invoke.addCommand(close);
		
		invoke.addCommand(close1);
		invoke.addCommand(open1);
		
		
		invoke.executeCommands();
		
		

		

	}

}

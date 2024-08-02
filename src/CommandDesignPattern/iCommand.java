package CommandDesignPattern;

public interface iCommand {
 void execute();
}
class OpenCommand implements iCommand{
	private iReceiver doc;
	public OpenCommand(iReceiver doc)
	{
		this.doc=doc;
	}
	@Override
	public void execute() {
		doc.open();
	}
	
}
class CloseCommand implements iCommand{
	private iReceiver doc;
	public CloseCommand(iReceiver doc)
	{
		this.doc=doc;
	}
	@Override
	public void execute() {
		doc.close();
	}
	
}

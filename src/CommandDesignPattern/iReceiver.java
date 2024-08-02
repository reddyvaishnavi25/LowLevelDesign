package CommandDesignPattern;

public interface iReceiver {
void open();
void close();
}

class GoogleSheet implements iReceiver{
	String name;
	public GoogleSheet(String name)
	{
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void open() {
		System.out.println(this.getName()+" opened");
	}
	
	@Override
	public void close() {
		System.out.println(this.getName()+" closed");
	}	
}

class GoogleDocs implements iReceiver{
	String name;
	public GoogleDocs(String name)
	{
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void open() {
		System.out.println(this.getName()+" opened");
	}

	@Override
	public void close() {
		System.out.println(this.getName()+" closed");
	}	
}
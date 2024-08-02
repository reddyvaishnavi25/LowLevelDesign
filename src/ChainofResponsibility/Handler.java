package ChainofResponsibility;

public abstract class Handler {
protected Handler nextHandler;
public Handler(Handler obj)
{
	this.nextHandler=obj;
}
public abstract void process(Request obj);
}

class LevelOneHandler extends Handler{

	public LevelOneHandler(Handler obj) {
		super(obj);
	}

	@Override
	public void process(Request obj) {
		if(obj.getRequestType()=="low")
		{
			System.out.println("task completed in level 1");
		}
		else
		{
			if(nextHandler!=null)
			{
				nextHandler.process(obj);
			}
		}
			
	}
	
}

class LevelTwoHandler extends Handler{

	public LevelTwoHandler(Handler obj) {
		super(obj);
	}

	@Override
	public void process(Request obj) {
		if(obj.getRequestType()=="medium")
		{
			System.out.println("task completed in level 2");
		}
		else
		{
			if(nextHandler!=null)
			{
				nextHandler.process(obj);
			}
		}
	}
	
}


class LevelThreeHandler extends Handler{

	public LevelThreeHandler(Handler obj) {
		super(obj);
	}

	@Override
	public void process(Request obj) {
		if(obj.getRequestType()=="high")
		{
			System.out.println("task completed in level 3");
		}
		else
		{
			if(nextHandler!=null)
			{
				nextHandler.process(obj);
			}
		}
	}
	
}


package SingleTonDesignPattern;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TVSet {
private static TVSet instance=null;
private static Lock mtx = new ReentrantLock();
private TVSet()
{ 
	System.out.println("TvSet object created");
}
public static TVSet getInstance()
{
	if(instance==null) //t1,t2,t3
	{
		mtx.lock();
		try {
			if(instance==null)
			{
				instance=new TVSet();
			}
		}
		finally {
			mtx.unlock();
		}
	}
	return instance;
}
}

package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
 private List<iObserver> observers=new ArrayList<>();
 public void register(iObserver obs)
 {
	 observers.add(obs);
 }
 public void unregister(iObserver obs)
 {
	 observers.remove(obs);
 }
 public void notifyAll(String status)
 {
	 for(int i=0;i<observers.size();i++)
	 {
		 observers.get(i).notify(status);
	 }
 }
}

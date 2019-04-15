import java.util.*; 

public class Subject{
	private ArrayList <Observer> observers = new ArrayList <Observer>();
    
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	public void notifyObservers() {
		Iterator it = observers.iterator();
		while (it.hasNext()) {
			Observer obs= (Observer) it.next();
			obs.update(this); 
		}
	}
}

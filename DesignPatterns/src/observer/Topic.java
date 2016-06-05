package observer;
import java.util.Observable;

public class Topic extends Observable{
	private String latestnews;

	public String getLatestnews() {
		return latestnews;
	}

	public void setLatestnews(String latestnews) {
		this.latestnews = latestnews;
		this.setChanged();
		this.notifyObservers();
	}
	
	
}

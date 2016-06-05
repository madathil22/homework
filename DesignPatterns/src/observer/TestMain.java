package observer;

import observer.subscribers.CnnSubscriber;
import observer.subscribers.TimesNowSubscriber;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Topic news=new Topic();
		CnnSubscriber cnn=new CnnSubscriber(news);
		TimesNowSubscriber toi=new TimesNowSubscriber(news);
		news.setLatestnews("FLOOD WARNING");
		news.setLatestnews("STOCK MARKET CRASH");
	}

}

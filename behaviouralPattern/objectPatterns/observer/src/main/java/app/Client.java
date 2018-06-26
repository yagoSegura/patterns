package app;

import observer.IObserver;
import observer.Observer;
import observer.Observer1;
import observer.Observer2;
import subject.LogSubject;

public class Client{
	public static void main(String[] args){
		LogSubject subject = new LogSubject();
		IObserver ob = new Observer();
		IObserver ob1 = new Observer1();
		IObserver ob2 = new Observer2();

		subject.attach(ob);
		subject.attach(ob1);
		subject.attach(ob2);

		subject.setState("State1");
		subject.setState("State2");
		subject.detach(ob1);
		subject.setState("state3");
	}
}

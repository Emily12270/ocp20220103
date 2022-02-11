package com.study.ocp.design_patten.observer;

public class Youtuber extends Subject{

	@Override
	public void add(Observer observer) {
		list.add(observer);
		
	}

	@Override
	public void remove(Observer observer) {
		list.remove(observer);
		
	}

	@Override
	public void notifyObserver(String data) {
		// 通知每一個訂閱者
		list.stream().forEach(observer -> observer.update("Youtuber -> " + data));
			
	}
}

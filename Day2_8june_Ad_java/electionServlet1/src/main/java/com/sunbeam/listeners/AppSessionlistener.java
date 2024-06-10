package com.sunbeam.listeners;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.sunbeam.pojos.User;

public class AppSessionlistener implements HttpSessionListener {
@Override
public void sessionCreated(HttpSessionEvent se) {
	
	System.out.println("new Httpsession satrted");
}

@Override
	public void sessionDestroyed(HttpSessionEvent se) {
	HttpSession session = se.getSession();
	User user =(User) session.getAttribute("curuser");
	System.out.println("new Httpsession stopped--" + user.getFirstName());
	}
}

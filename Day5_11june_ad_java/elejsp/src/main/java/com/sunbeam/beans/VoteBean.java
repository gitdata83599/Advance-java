package com.sunbeam.beans;

import com.sunbeam.daos.CandidateDao;
import com.sunbeam.daos.CandidateDaoImpl;

public class VoteBean {
	private String user;
	private int id;
	
	public VoteBean() {
		
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void voteCandidates() {
		try(CandidateDao candDao = new CandidateDaoImpl()) {
			VotecandidateList = candDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}


}

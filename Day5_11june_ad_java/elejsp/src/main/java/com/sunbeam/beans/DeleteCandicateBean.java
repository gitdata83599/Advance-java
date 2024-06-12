package com.sunbeam.beans;

import com.sunbeam.daos.CandidateDao;
import com.sunbeam.daos.CandidateDaoImpl;
import com.sunbeam.pojos.Candidate;

public class DeleteCandicateBean {
	private int id;
	private String name;
	private String party;
	private int votes;
	private int count;
	
	public DeleteCandicateBean() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public void updateCandidate() {
	try(CandidateDao candDao = new CandidateDaoImpl()) {
		int count = candDao.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
}

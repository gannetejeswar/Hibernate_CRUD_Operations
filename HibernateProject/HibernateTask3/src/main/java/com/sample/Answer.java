package com.sample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	private int aid;
	private String answer;
	
	@ManyToOne
	private Question q;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQ() {
		return q;
	}

	public void setQ(Question q) {
		this.q = q;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int aid, String answer, Question q) {
		super();
		this.aid = aid;
		this.answer = answer;
		this.q = q;
	}
	

}

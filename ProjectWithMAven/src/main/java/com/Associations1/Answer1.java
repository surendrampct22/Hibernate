package com.Associations1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Answer1 {

	@Id
	@Column(name = "answer_id")
	private int answerId;

	private String Answer;

	@ManyToOne
	@JoinColumn(name = "ques")
	private Question1 question;

	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer1(int answerId, String answer, Question1 question) {
		super();
		this.answerId = answerId;
		Answer = answer;
		this.question = question;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	public Question1 getQuestion() {
		return question;
	}

	public void setQuestion(Question1 question) {
		this.question = question;
	}

}

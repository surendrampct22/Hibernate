package com.Associations1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Question1 {

	@Id
	@Column(name = "question_id")
	private int questionID;
	private String question;

	@OneToMany
	@JoinColumn(name = "ans")
	List<Answer1> answer;

	public Question1() {
		super();

	}

	public Question1(int questionID, String question, List<Answer1> answer) {
		super();
		this.questionID = questionID;
		this.question = question;
		this.answer = answer;
	}

	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer1> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer1> answer) {
		this.answer = answer;
	}

}

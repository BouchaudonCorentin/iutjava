package edu.iut.app;

import java.util.Date;
import java.util.LinkedList;

import javax.xml.bind.Element;
import javax.xml.parsers.DocumentBuilder;


public class Agenda extends LinkedList<ExamEvent> {
	
	public Agenda() {		
	}
	
	public void addCheckedEvent(ExamEvent examEvent) {
		this.add(examEvent);
	}

}

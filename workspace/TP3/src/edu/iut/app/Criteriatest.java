package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class Criteriatest {

	 public static void main(String[] args) {
	      List<Person> persons = new ArrayList<Person>();

	      persons.add(new Person(,"Corentin","Bouchaudon","corentin.bouchaudon@u-psud.fr", ));
	    
		/*	this.personFunction=personFunction;
			this.firstname=firstname;
			this.lastname=lastname;
			this.email=email;
			this.phone=phone;*/

	   }

	   public static void printPersons(List<Person> persons){
	   
	      for (Person person : persons) {
	         System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
	      }
	   }      
}


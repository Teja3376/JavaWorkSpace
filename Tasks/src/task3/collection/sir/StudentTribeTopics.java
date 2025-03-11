package task3.collection.sir;

import java.io.Serializable;

public class StudentTribeTopics  {

	private String name;
	private String description;
	private String id;
	public StudentTribeTopics(String name, String description, String id) {

		this.name = name;
		this.description = description;
		this.id = id;
	}
	

	@Override
	public String toString() {

		return name + description + id;
	} 

}
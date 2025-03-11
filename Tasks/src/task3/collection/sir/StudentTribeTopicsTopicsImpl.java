package task3.collection.sir;


import java.util.Arrays;
import java.util.List;

public class StudentTribeTopicsTopicsImpl {
	
	public static void main(String[] args) {
		
	 
	List topics=Arrays.asList(new StudentTribeTopics("Encapsulation :","Inheritance :"," : OOPS"),
            new StudentTribeTopics("Checked Exception :","Un Checked Exception :"," ExceptonsHandling"),
            new StudentTribeTopics("SET","LIST","Collection"));
	
	System.out.println(topics);
	
	List mydata=Arrays.asList(10,20,30);
	  System.out.println(mydata);
	}

}
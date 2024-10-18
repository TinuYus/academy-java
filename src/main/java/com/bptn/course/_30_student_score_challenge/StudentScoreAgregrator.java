package com.bptn.course._30_student_score_challenge;

import java.util.HashMap;
import java.util.Map;

public class StudentScoreAgregrator {
	
	public static double calculateAverage(Student student, Map<String,Double>scores ) {
		double sum = 0;
		for(Double score:scores.values()) {
			sum+=score;
		}
		
		double average = sum/scores.size();
				return average;
		
	}

	public static void main(String[] args) {
		Map<String,Double>scores = new HashMap<>();
		scores.put("Course 1", 90.0);
		scores.put("Course 2", 75.5);
		scores.put("Course 3", 98.3);
		Student s1 = new Student("Student One:", scores);
		
		System.out.printf("The average score is:%.2f " + calculateAverage(s1,scores));
		

	}

}

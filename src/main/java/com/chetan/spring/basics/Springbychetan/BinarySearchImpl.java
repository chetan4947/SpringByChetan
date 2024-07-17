package com.chetan.spring.basics.Springbychetan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//@Component -> It says that it is beans which will be having dependencies.

@Component
public class BinarySearchImpl {
	
	//@Autowired-> Here BinarySearchImpl depends on sortAlgorithm
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	//constructor
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}
	
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearch) {
		
		int[] sortedNumber = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		return 3;
	}

	
	
}

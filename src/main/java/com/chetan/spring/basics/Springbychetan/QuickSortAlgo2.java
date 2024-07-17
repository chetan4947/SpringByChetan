package com.chetan.spring.basics.Springbychetan;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary 

//@Primary - It can be used when we have two or more component depending 
public class QuickSortAlgo2 implements SortAlgorithm{

	
	public int[] sort(int[] numbers) {
		//logic for quick sort
		
		return numbers;
	}

}

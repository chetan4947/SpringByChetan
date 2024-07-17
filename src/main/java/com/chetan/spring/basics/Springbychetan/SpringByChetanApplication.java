package com.chetan.spring.basics.Springbychetan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringByChetanApplication {  

	//What are the different beans ?
	//What are the dependency for the beans ?
	//Where to search for beans ? -> no need as we are in the same packages
		
	public static void main(String[] args) {
		
		//Earlier we have to create the instance for this.But now spring we are using so it will create the 
		//the instance for us which is on line number 19
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgo2());
		//Application Context ->It will maintain all the beans. So we are going to get the beans from this.
		
		ConfigurableApplicationContext applicationContext= 
				SpringApplication.run(SpringByChetanApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = 
				binarySearch.binarySearch(new int[] {12,4,6}, 3);
		System.out.println(result);
	}

}

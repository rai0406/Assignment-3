package Robomq;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class ElectionSet {

	public static void main(String[] args) {

		HashSet<Election> p=new HashSet<Election>();
		
		p.add(new Election(1,"bjp",12,"abc","def",13));
		p.add(new Election(3,"nca",12,"mno","pqr",15));
		p.add(new Election(3,"nca",12,"mno","pqr",15));
		p.add(new Election(2,"app",11,"ghi","jkl",14));
		p.add(new Election(4,"nlk",11,"ghi","jkl",14));
		
		
		System.out.println(p);
		
		//Scanner sc=new Scanner(System.in);
		//int d=sc.nextInt();
		
		/*
		 * for(Election i: p) { System.out.println(i.getDate());
		 * 
		 * }
		 */
		
	
		 Map<Integer, List<Election>> groupByDate = p.stream().collect(
				    Collectors.groupingBy(Election::getDate));
				  
				  System.out.println(groupByDate.get(11));
		}

	}


package Robomq;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class AuthorMap {

	public static void main(String[] args) {
		
		
		
		HashMap<String,Author>t=new HashMap<String,Author>();
		t.put("abc",new Author(1,"astha","us"));
		t.put("def",new Author(2,"aryan","uk"));
		t.put("ghi",new Author(3,"ashu","canda"));
		t.put("jkl",new Author(1,"astha","us"));
		t.put("mno",new Author(3,"ashu","canda"));
		
		
		
		  System.out.println("The details of the author are:");
		  
		  for(Map.Entry mp:t.entrySet()) { Author ath=(Author)mp.getValue();
		  System.out.println(mp.getKey()+" written by "+ath.getauthor()+" residing at "
		  +ath.getadd()); }
		 
		  System.out.println(" ");
		
		/*
		 * for (Map.Entry mp : t.entrySet()) { Author ath=(Author)mp.getValue(); for
		 * (Map.Entry np : t.entrySet()){ Author bth=(Author)np.getValue(); if
		 * (ath.getauthor().equals(bth.getauthor())) {
		 * System.out.println(ath.getauthor()); }
		 * 
		 * }
		 * 
		 * }
		 */
		HashSet<String>set=new HashSet<>();
		
		for (Map.Entry mp : t.entrySet()) 
		{
			Author ath=(Author)mp.getValue();
			if(set.add(ath.getauthor())==false)
			{
				System.out.println("id: "+ath.getId()+" name: "+ath.getauthor()+" address: "+ath.getadd());
			}
		}
		
	}
}

		
		
		
		
		
	

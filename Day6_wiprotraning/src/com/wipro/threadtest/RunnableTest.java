package com.wipro.threadtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnableTest {
	
	


	static boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Collections.synchronizedList(new ArrayList<>()); //
        names.add("Amit");
        names.add("Jayanta");
        names.add("Ethan");
        names.add("David");
        names.add("Olivia");
        names.add("Priya");

        System.out.println("Original list: " + names);

	
	
	
	Thread vowelCapital = new Thread(()->{
		for(int i=0;i<names.size();i++) {
			String name = names.get(i);
			try {
				if(isVowel(name.charAt(0))) {
					names.set(i, name.toUpperCase());				
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	});
	
	Thread consonantLowercaser = new Thread(() -> { //
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (!name.isEmpty() && !isVowel(name.charAt(0))) { //
                names.set(i, name.toLowerCase()); //
            }
        }
        System.out.println("Consonant lowercasing thread finished.");
    });
	
	
	}

}

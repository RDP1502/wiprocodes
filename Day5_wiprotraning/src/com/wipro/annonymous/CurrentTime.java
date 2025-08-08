package com.wipro.annonymous;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.function.Consumer;
public class CurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> currentTime =(time)-> System.out.println(LocalTime.now(ZoneId.of(time)));
		
		currentTime.accept(("Europe/London"));
		
		

	}

}

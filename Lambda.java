package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda {

	public static void main(String[] args) {
		
	 List<Integer> list = Arrays.asList(3, 5, 10, 7);
	 
	 
//Esse comando imprime  os numeros da lista	 
	    // Stream<Integer>st1 = list.stream();
	 
//Esse comando imprime multiplicando por dez
	     Stream<Integer>st1 = list.stream().map(x -> x * 10);
	    System.out.println(Arrays.toString(st1.toArray()));
	    
	    
	    Stream<String>st2 = Stream.of("Maria" ,"Alex" , "Bob");
	    System.out.println(Arrays.toString(st2.toArray()));
	
	    //Esse comando e infinito mais so´vai imprimeir dez elementos
	    Stream<Integer>st3 = Stream.iterate(0, x -> x + 2);
	    System.out.println(Arrays.toString(st3.limit(10).toArray()));
	
	
	    int sum = list.stream().reduce(0, (x,y) -> x + y);
	    System.out.println("Sum = " + sum);
	    
	    
	    List<Integer>newList = list.stream()
	    		.filter(x -> x % 2 == 0)
	    	    .map(x -> x * 10)
	    	    .collect(Collectors.toList());
	    	    
	    		System.out.println(Arrays.toString(newList.toArray()));
	    		
	}
}
		
		
		
		
		
	
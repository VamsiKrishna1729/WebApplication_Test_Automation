import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class streamsTest1 {
	    // count num of names starting with "A"
	  //@Test
	public void regular() {
		// TODO Auto-generated method stub

		ArrayList<String> names=new ArrayList<String>();
		names.add("Vamsi");
		names.add("Avanthi");
		names.add("Krishna");
		names.add("Akhil");
		names.add("Amala");
		int count=0;
		for(int i=0;i<names.size();i++)
		{
			if(names.get(i).startsWith("A"))
			{
				count++;
			}
	}
	System.out.println(count);	
	}

	 // @Test
	  public void streamFilter()
	  {
		ArrayList<String> names1= new ArrayList<String>(); 
		names1.add("Vamsi");
		names1.add("Akash");
		names1.add("Krishna");
		names1.add("Akhila");
		names1.add("Adam");
		Long c=names1.stream().filter(s->s.startsWith("V")).count();
		  System.out.println(c);
		  // no life for intermediate op if there is no terminal op
		  // terminal op will execute only if inter op (filter) returns true
		  // here we are using filter in stream API 
		Long d=Stream.of("Vamsi","Akash","Krishna","Akhila","Adam").filter(s->{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		
		// print all names of arraylist with length of greater than 4 
		names1.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s));		
		  
	  }	  
	  
	 // @Test
	  public void streamMap()
	  {
		  ArrayList<String> names=new ArrayList<String>();
			names.add("Vamsi1");
			names.add("Avanthi1");
			names.add("Krishna1");
			names.add("Akhil1");
			names.add("Amala1");
		  
		  //print the names which have last letter as "a" with Uppercase
		  Stream.of("Aha","Akhil","Rama","Vamsi","Hasya","Akira").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		  .forEach(s->System.out.println(s));
		  // print names which have first letter as "a" with uppercase and sorted
		  List<String> names1=Arrays.asList("Aha","Akhil","Rama","Vamsi","Hasya","Akira");
		  names1.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
		  // merging 2 different lists
		  Stream<String> newStream=Stream.concat(names.stream(),names1.stream());
		  boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Rama99"));
		  System.out.println(flag);
		  Assert.assertTrue(flag);
		  	  		  
	  }
	  @Test
	  public void streamCollect()
	  {
		  List<String> ls=Stream.of("A1bg","B1ga","C1bg","D1gb","E1bg").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
				  .collect(Collectors.toList());
		  System.out.println(ls.get(0));
		  
		  //print unique numbers from below array
		  //sort the array
		  List<Integer> values=Arrays.asList(3,2,2,7,5,1,9,7);
		  values.stream().distinct().forEach(s->System.out.println(s));
		  // get the 3rd element after sorted 
		  List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
		  System.out.println(li.get(2));
		  		  
	  }
	  
}

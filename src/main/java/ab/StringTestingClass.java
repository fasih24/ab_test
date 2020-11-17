package ab;

import java.util.HashMap;
import java.util.LinkedList;

public class StringTestingClass {
	int aa;
	String bb;
	String cc;
public StringTestingClass(int a,String b, String c) {
	this.aa=a;
	this.bb=b;
	this.cc=c;
}
public void printInfo() {
	System.out.println("acc number : "+this.aa+"  name person : "+this.bb+"  acc type : "+this.cc);
	
}
	public static void main(String[] args) {
		String s="i was in the bank before.";
		String s2="1 2+3=3+9+9";
	String [] ss=s2.split(" ");
	
	for(String s1:ss) {
	System.out.print(s1);
	}
	System.out.println();
//String f="fasih";
//        f=(" uddin");
//       System.out.println(f);
	StringTestingClass bankAc=new StringTestingClass(123,"fasih","checking");
	StringTestingClass bankAc2=new StringTestingClass(122,"tom","checking");
	StringTestingClass bankAc3=new StringTestingClass(121,"lee","checking");
	LinkedList<StringTestingClass> link=new LinkedList<StringTestingClass>();
	              link.add(bankAc);
	              link.add(bankAc2);
	              link.add(bankAc3);
	              link.add(new StringTestingClass(123,"fasihuddin","checking"));
	           
	              for(StringTestingClass b:link) {
	            	 System.out.println(b.aa+" : "+b.bb+" : "+b.cc);
	            	
	            	//  b.printInfo();
	            	  }
//	  HashMap<String,String> capital=new HashMap<String, String>(); 
//	                     capital.put("usa", "DC");
//	                     capital.put("uk", "london");
//	                     capital.put("sk", "suel");
//	                     System.out.println(capital);
	                    
	}

}

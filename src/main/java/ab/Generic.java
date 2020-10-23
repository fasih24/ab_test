package ab;
class test <a,b> {
	 a obj1;
	 b obj2;
	 test(a ob1,b ob2){
			this.obj1=ob1;
			this.obj2=ob2;
		}
	 public void printf() {
		 System.out.println(this.obj1);
		 System.out.println(this.obj2);
	 }
	}
class test2 <a> {
	 a obj1;
	 
	 test2(a ob1){
			this.obj1=ob1;
		 
		}
	public a getTest2() {
		return this.obj1;
	}
	public void setTest2(a ab) {
		this.obj1=ab;
	}
	 }
	
public class Generic {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     test<Integer,Integer> ab=new test<Integer,Integer>(2,7);
        ab.printf();
        test2<Integer> a=new test2<Integer>(2222);
        
        System.out.println(a.getTest2());
        a.setTest2(12345);
        System.out.println(a.getTest2());
        
	}

}

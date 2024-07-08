
public class BB1 {

	public static void main(String[] args) {
		AA1 o1=new AA1();
		AA1 o2=new AA1();
		AA1 o3=new AA1();
		
		o1.x=10;
		o2.x=90;
		o3.x=6;
		
		o1.y=10;
		o2.y=90;
		o3.y=6;
		
		System.out.println(o1.x+o2.x+o3.x); //106
		System.out.println(o1.y+o2.y+o3.y);  //18
	}

}

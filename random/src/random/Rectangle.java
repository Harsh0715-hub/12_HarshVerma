package random;
class Rectangle1{
	int len;
	int wid;
	static int len1;
	static int wid2;
	
	public Rectangle1(int len , int wid) {
		this.len= len;
		this.wid=wid;
		
	}
	
	
}

public class Rectangle {

	
	
	

	public static void main(String[] args) {
		Rectangle1 r1 = new Rectangle1(20, 30);
		System.out.println(r1.len);
		System.out.println(r1.wid);
		Rectangle1.len1=30;
		Rectangle1.wid2=40;
		System.out.println(Rectangle1.len1);
		System.out.println(Rectangle1.wid2);
		

	

}
}

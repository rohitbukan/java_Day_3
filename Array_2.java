
public class Array_2 {

	public static void main(String args[]) {
		DemoArr arr[]=new DemoArr[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new DemoArr();
			
		}
		for(int i = 0; i < arr.length; i++){
			arr[i].disp();
		}
	}
}
class DemoArr{
public void disp() {
	System.out.println("Inside Disp Method");
	
	}
}

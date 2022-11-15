package Info;

public class ArmstrongNumner {
	public static void main(String[] args) {
		int i=153;
		int num = i;
		int actnum=0;
		
		while(i>0) {
			int r=i%10;
			actnum=r*r*r+actnum;
		    i=i/10;
		}
		if(actnum==num) {
			System.out.println("no is armstrong");
		}
		else {
			System.out.println("no is not armstrong");
		}
	}

}

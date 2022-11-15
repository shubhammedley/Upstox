package Info;

public class Digit_in_ascending_order {
	public static void main(String[] args) {
		String s = "325626914";
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp = ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					
				}
			}
		}
		//simple for loop
		/*for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}*/
		System.out.println("No changes");
		//using for each loop
		for(char s1:ch)
			System.out.print(s1);
	}

}

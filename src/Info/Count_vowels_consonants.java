package Info;

public class Count_vowels_consonants {
	public static void main(String[] args) {
		String str = "communication";
		
		int vowels=0;
		int cons=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vowels++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				cons++;
			}
		}
		System.out.println("Vowels:"+vowels+" Consonants:"+cons);
	}

}

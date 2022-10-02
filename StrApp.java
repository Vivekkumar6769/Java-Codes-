package chap1;

public class StrApp {

	public static void main(String[] args) {
		 String x="Study";
		 String y="Hard";
		 
		 //concat_method
		 
		 String z=x.concat(y);
		 System.out.println(z);
		 
		 //replace_method
		 
		 z=z.replace("Hard", "Easy");
		 System.out.println(z);
		 
		 if(z.equals("StudyEasy"))
		 {
				System.out.println("Text is Study Easy");
			}
		 else{
				System.out.println("Text is not Study Easy");
			}
		 
		 
		 

	}

}

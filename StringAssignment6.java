

import java.util.ArrayList;

public class PrintArgToMainMethod{

	public static void main(String[] args) {
		
		ArrayList<String> listWords = new ArrayList<String>();
		for(int i=0;i<args.length;i++){
			listWords.add(args[i]);
			
		}
		listWords.replaceAll(u ->u.replaceAll("[^a-zA-Z]"," "));
		System.out.println(listWords);
		
		
		
	}

}

package CSE420Lab01;
import java.util.*;
import java.io.*;
public class CSE421Lab01 {
	static String keywords="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TIkTOK");
		
		String [] keywordsArray= {"int","int","double","float","if","else"};
		try {
			File inputfile= new File("input.txt");
			Scanner sc=new Scanner(inputfile);
			//System.out.print("Keywords:");
			while(sc.hasNextLine()) {
				String currentLine=sc.nextLine();
				String [] currentLineArray=currentLine.split(" ",2);
				if(Arrays.asList(keywordsArray).contains(currentLineArray[0])) {
					//System.out.println(currentLineArray[0]);
					
					addword(currentLineArray[0]);
				}
				
			}
			sc.close();
			System.out.println("Keywords:"+keywords);
		}
		catch(Exception e) {
			System.out.println(e);
			
		}

	}
	public static void addword(String word) {
		if(keywords.equals("")) {
			keywords= word;
			//System.out.print(word);
		}else {
			//System.out.print(","+word);
			keywords=keywords+","+word;
		}
		
	}

}

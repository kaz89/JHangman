package Jhangman;
import java.util.Scanner;

public class wordLogic {
	public void gameLogic(String word) {
		boolean condition=true;
		String hiddenString=word;
		char[] arrayChar=word.toCharArray();
		char[] cHidden=hiddenString.toCharArray();
		int tries=3;
		int count=0;
		for(int i=0;i<cHidden.length;i++) {
			cHidden[i]='*';
		}
		System.out.println(cHidden);
		System.out.println("Guess word or letter: ");
		Scanner input=new Scanner(System.in);
		String guessedWord;
		int j;
		while(condition) {
		for(j=tries;j>=0;j--) {
			guessedWord=input.next();
			if (guessedWord.equals(word)) {
				count++;
				condition=false;
				break;
			}
			if(j==0) {
				System.out.println("Sorry,you lost.The word was:"+word);
				condition=false;
				return;
			}
			else {
			char guessedWordToChar=guessedWord.charAt(0);
			count++;
			tries--;
		       for(int i=0;i<arrayChar.length;i++) {
			      if(arrayChar[i]==guessedWordToChar) {
				    cHidden[i]=guessedWordToChar;
				}
			    
			}
		  
		     
		}
			
		System.out.println(cHidden);
		
	}
		System.out.println("You guess the number in "+count+" strikes and tries "+tries);
				
  }
		
 }
}
		
		
		
	




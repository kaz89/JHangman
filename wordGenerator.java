package Jhangman;
import java.util.*;
import java.io.*;

public class wordGenerator {
	public String generateFromFile() {
	ArrayList<String> words=new ArrayList<String>();
	try(BufferedReader read=new BufferedReader(new FileReader("src/Jhangman/wordlist10k.txt"))){
		String line;
		while((line=read.readLine()) !=null){
			words.add(line);
		}
	}catch (IOException e) {
		e.printStackTrace();
	}
	int index=(int)(Math.random()*words.size());
	return words.get(index);
		
		
	}
    
}

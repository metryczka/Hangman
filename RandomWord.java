package application;

import java.util.Random;


public class RandomWord {
	private String[] words = {"stomp", "elephant", "zoo", "kangaroo", "jump", "monkey", "swing", "snake", "giraffe", "dolphin"};
	private String chosenWord;
	private Random random = new Random();
	private char[] characters;
	
	
	
	public RandomWord() {
		this.chosenWord = words[random.nextInt(words.length)];
		characters = new char[chosenWord.length()];
	}
	public String toString() {
		String text = "";
		StringBuilder theWorld= new StringBuilder();
		
		for (char character: characters) {
			theWorld = character == '\u0000' ? theWorld.append("_"): theWorld.append(character);
			theWorld.append(" ");	
			
		}
		text = theWorld.toString();
		return text;
	}
	public boolean addGues(char c) {
		//Fill in c in the character word
		//whenever it's found in the random word
		
		for (int i = 0; i<chosenWord.length(); i++) {
		    if (chosenWord.charAt(i) == c) {
		    	characters[i] = c;
		    	return true;
		    }   	
		}
		return false;
		}
	
	
	
	public boolean isGuessed() {
		
	
		for (char character: characters) {
			if (character == '\u0000') {
				return false;
			}
		}
		return true;
	}	
	
	
}	

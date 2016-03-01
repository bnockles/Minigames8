
public class HiddenWord {
	String word;
	
	public HiddenWord(String puzzleString){
		this.word = puzzleString;
	}
	
	public String getHint(String test){
		String hint;
		for(int i = 0;i<test.length();i++){
			hint+="*"
		}
		
		for(int i = 0;i<this.word.length();i++){
			if (this.word.charAt(i) == test.charAt(i)){
				
			}
		}
		return hint;
		
	}
}

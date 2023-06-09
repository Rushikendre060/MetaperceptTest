package string;

public class LongestWordFinder {
	
	public static String findLongestWord(String sentence)
	{
		String words[]=sentence.split("\s+");
		String longestWord=" ";
		
		for(String word : words)
		{
			if(word.length() > longestWord.length())
			{
				longestWord=word;
			}
		}
		return longestWord;
	}
	
	public static void main(String[] args) {
		
		String inputstr="dummy text of the printing and typesetting industry.";
		String Output=findLongestWord(inputstr);
		System.out.println("Longest word in given String is :"+Output);
	}

}

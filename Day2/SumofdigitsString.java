package Week2.Day2;

public class SumofdigitsString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum = 0;
		String replaceAll = text.replaceAll("[^0-9]", "");
		char[] charArray = replaceAll.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			char charecter = charArray[i];
			int numericValue = Character.getNumericValue(charecter);
			sum = sum + numericValue;
						
			
		}
		
		System.out.println(sum);

	}

}

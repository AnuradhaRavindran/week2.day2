package Week2.Day2;



public class Removeduplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0, i, j;
		String[] charArray = text.split("");
		// char[] charArray = text.toCharArray();
		for (i = 0; i < charArray.length; i++) {

			for (j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {

					count++;
					if (count > 1) {
						System.out.println("");
					}
				}
			}
			System.out.print(charArray[j]);

		}

	}

}
		

	




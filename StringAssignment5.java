

public class Vowel {
	public static void main(String[] args) {
		String stringToCheck = "Mumbai";
		String stringToComp = "Pune";
		String reslutString = stringToCheck.concat(stringToComp);
		System.out.println(reslutString);
		reslutString = reslutString.replaceAll("[aeiou]", "");
		System.out.println(reslutString);
		for (int i = 0; i < reslutString.length(); i++) {
			int count = 0;
			for (int j = 0; j < reslutString.length(); j++) {
				if (reslutString.charAt(i) == reslutString.charAt(j) && i != j) {
					count++;
					break;

				}
			}
			if (count == 0)
				System.out.println(reslutString.charAt(i));
		}

	}
}

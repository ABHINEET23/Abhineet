

public class CountMatrix {
	
		public static void countMatrixNumber(int m) {
			for (int i = m; i > 0; i--) {
				int k = 1;
				for (int j = i; j > 0; j--) {
					System.out.print(k++);
				}
				System.out.println();
			}
		}

		public static void main(String[] args) {

			countMatrixNumber(4);
		}
	}

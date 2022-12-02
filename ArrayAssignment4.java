

package javaTraining.arrayString;

public class FirstLastMatrix {
	
		public static void firstLastMatrix(int a[][], int m, int n) {
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (i == 0) {
						System.out.print(a[i][j] + "");
					}
					
					

					else if (i == m - 1) {
						System.out.print(a[i][j] + "");
					}
					

				}

			}

			System.out.println("");
			for (int i = 0; i < m; i++) {
				int j = 0;
				System.out.print(a[i][j]);

			}
			for (int i = 0; i < m; i++) {
				int j = n - 1;
				System.out.print(a[i][j]);

			}

		}

		public static void main(String[] args) {
			int a[][] = { { 1, 2, 3 }, 
					      { 5, 6, 7 }, 
					      { 1, 2, 3 } 
					      };

			firstLastMatrix(a, 3, 3);
		}

}

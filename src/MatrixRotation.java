import java.util.Random;

public class MatrixRotation {

	public MatrixRotation() {

	}

	public static void main(String[] args) {
		int n;
		n = 5;
		int mat[][] = new int[n][n];

        Random random = new Random();

		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				mat[i][j] = random.nextInt(100);
		}
		
		MatrixRotation.displayMatrix(mat, n);
		
		System.out.println("after rotation...");
		
		MatrixRotation.rotate(mat, n);  
	}


	public static void rotate(int mat[][], int n) {
		int[][] res = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				res[j][n - i - 1] = mat[i][j];
		}
		displayMatrix(res, n);

	}

	public static void displayMatrix(int mat[][], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
	}
}

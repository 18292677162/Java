package Test;

public class Test {
	public static void main(String[] args) {
	    PrintTable();
	}
	
	
    //Multiplication table
	public static void PrintTable() {
		for(int i = 1;i <= 9;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.printf("%d*%d=%2d ", i, j, i * j);
			}
			System.out.println();
		}
	}
}


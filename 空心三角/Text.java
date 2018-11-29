public class Text {
	public static void main(String[] args) {
		PrintStar(6);
		System.out.println();
		PrintStar(10);
	}
	
	public static void PrintStar(int size) {
		for (int i = 1; i <= size; i++) {
			if(i==size){
				for (int j = 0; j < 2*size-1; j++) {
					System.out.print("*");
				}
			}else{
				for (int j = 1; j <= size - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= 2 * i - 1; k++) {
					if (k == 1 || k == 2 * i - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}

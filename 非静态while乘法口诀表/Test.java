package Non-static while multiplication formula table;

public class Test {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 9){
        	int j = 1;
        	while(j <= i){
                System.out.print(i + "*" + j + "=" + i*j + "  ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
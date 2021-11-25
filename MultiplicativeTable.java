public class MultiplicativeTable {
    public static void main(String[] args) {
        int numbers = 10;

        for(int i=0; i<numbers+1; i++) {
            int result = numbers * i;
            System.out.println(i + ". " + result);
        }
    }
}
public class ex2b {
    public static void main(String[] args) {
        int numbers = 10;
        int i = 0;
        int sum = 0;

        do {
            sum += i;
            i++; 
        } while(i < numbers);


        System.out.println("Suma este: " + sum);
    }
}
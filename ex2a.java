public class ex2a {
    public static void main(String[] args) {
        int numbers = 10;
        int i = 0;
        int sum = 0;

        while(i < numbers) {
            sum += i;
            i++;
        }

        System.out.println("Suma este: " + sum);
    }
}
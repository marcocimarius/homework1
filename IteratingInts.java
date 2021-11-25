public class IteratingInts {
    public static void main(String[] args) {
        int numbers = 10;
        String multiplier = "";
        int result;
        
        for(int i=1; i<numbers; i++) {
            multiplier += 1;
            result = Integer.valueOf(multiplier) * i;
                System.out.println(result); 
            
        }
    }
}
package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        // TODO 
        String zero= "nolla";
        String pospar = "positiivinen parillinen";
        String pospart = "positiivinen pariton";
        String negpar = "negatiivinen parillinen";
        String negpart = "negatiivinen pariton";
        if (n > 0) {
            if (n % 2 == 0) {
                return pospar;
            } else {
                return pospart;
            }
        } else if (n < 0) {
            if (n % 2 == 0) {
                return negpar;
            } else {
                return negpart;
            }
        } else {
            return zero;
        }
    }
}

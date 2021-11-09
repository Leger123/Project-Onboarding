import java.util.ArrayList;
import java.util.List;

public class GCD {
    public int greatestCommonDenominator(int array[]){
        int max = 50;
        int gcd = 1;
        boolean isGood = true;
        List<Integer> gcdList= new ArrayList<>();

        for(int i = 1; i<=max; i++){
            for(int j: array){
                if(j%i != 0) {
                    isGood = false;
                    break;
                }
            }

            if(isGood){
                gcdList.add(i);
            }

            isGood = true;
        }


        for(int k: gcdList){
            if(k>gcd){
                gcd = k;
            }
        }

        return gcd;
    }
}

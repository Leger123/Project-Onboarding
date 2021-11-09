public class Stocks {

    public int stocksFunction(int array[]){
        int initialValue = array[0];
        int min = initialValue;
        int max = initialValue;

        for(int i : array){
            if(i >max){
                max = i;
            }
        }

        for(int j: array){
            if(j<min){
                min = j;
            }
        }

        return (max-min);
    }
}

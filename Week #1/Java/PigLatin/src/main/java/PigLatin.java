import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PigLatin {
    public String pigLatin(String input){
        String result = "";

        List<String> myList = new ArrayList<>(Arrays.asList(input.split(" ")));

        for(int i = 0; i<myList.size(); i++){
            if(i == myList.size()-1){
                result += (myList.get(i).substring(1) + myList.get(i).substring(0,1) + "ay");
                break;
            }

            result += (myList.get(i).substring(1) + myList.get(i).substring(0,1) + "ay ");
        }

        return result;
    }
}

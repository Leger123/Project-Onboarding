import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PigLatin {
    public StringBuilder pigLatin(String input){
        StringBuilder result = new StringBuilder("");

        List<String> myList = new ArrayList<String>(Arrays.asList(input.split(" ")));

        for(int i = 0; i<myList.size(); i++){
            if(i == myList.size()-1){
                result.append(myList.get(i).substring(1) + myList.get(i).substring(0,1) + "ay");
                break;
            }

            result.append(myList.get(i).substring(1) + myList.get(i).substring(0,1) + "ay ");
        }

        return result;
    }
}

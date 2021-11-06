import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PigLatin {
    public String pigLatin(String input){
        StringBuilder result = new StringBuilder();

        List<String> myList = new ArrayList<>(Arrays.asList(input.split(" ")));

        for(int i = 0; i<myList.size(); i++){
            if(i == myList.size()-1){
                switch(myList.get(i).charAt(0)){
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        result.append(myList.get(i)).append("way");
                        break;
                    default:
                        result.append(myList.get(i).substring(1)).append(myList.get(i).charAt(0)).append("ay");
                }
                break;
            }

            switch(myList.get(i).charAt(0)){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    result.append(myList.get(i)).append("way ");
                    break;
                default:
                    result.append(myList.get(i).substring(1)).append(myList.get(i).charAt(0)).append("ay ");
            }
        }

        return result.toString();
    }
}

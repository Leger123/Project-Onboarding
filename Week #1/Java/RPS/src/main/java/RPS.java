public class RPS {
    public static String rpsFunction(String p1, String p2){
        String result;

        switch(p1){
            case "rock":
                switch (p2) {
                    case "rock":
                        result = "TIE";
                        break;
                    case "paper":
                        result = "Player 2 wins";
                        break;
                    case "scissors":
                        result = "Player 1 wins";
                        break;
                    default:
                        result = "Invalid input, try again";
                        break;
                }
                break;

            case "paper":
                switch (p2) {
                    case "rock":
                        result = "Player 1 wins";
                        break;
                    case "paper":
                        result = "TIE";
                        break;
                    case "scissors":
                        result = "Player 2 wins";
                        break;
                    default:
                        result = "Invalid input, try again";
                        break;
                }
                break;

            case "scissors":
                switch (p2) {
                    case "rock":
                        result = "Player 2 wins";
                        break;
                    case "paper":
                        result = "Player 1 wins";
                        break;
                    case "scissors":
                        result = "TIE";
                        break;
                    default:
                        result = "Invalid input, try again";
                        break;
                }
                break;

            default:
                result = "Invalid input, try again";;
                break;
        }


        return result;
    }
}

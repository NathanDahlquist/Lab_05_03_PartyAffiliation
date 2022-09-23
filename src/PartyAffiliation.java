public class PartyAffiliation {
    public static void main(String[] args) {
        String politicalParty;

        System.out.println("Please enter your political party [D/R/I]");
        politicalParty = "y";

        if (politicalParty.equalsIgnoreCase("D")){
            System.out.println("You get a Democratic Donkey.");
        }else if (politicalParty.equalsIgnoreCase("R")){
            System.out.println("You get a Republican Elephant.");
        }else if (politicalParty.equalsIgnoreCase("I")){
            System.out.println("You get an Independent Human");
        }else{
            System.out.println("You have picked some other party");
        }
    }
}

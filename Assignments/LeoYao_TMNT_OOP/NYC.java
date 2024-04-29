public class NYC {
    public static void main(String[] args) {
        // create an array of the 4 original turtles
        NinjaTurtle[] turtles = new NinjaTurtle[4];
        turtles[0] = new NinjaTurtle("Leonardo");
        turtles[1] = new NinjaTurtle("Raphael");
        turtles[2] = new NinjaTurtle("Donatello");
        turtles[3] = new NinjaTurtle("Michelangelo");
        // print out the original turtles and call ninjitsu
        for (NinjaTurtle turtle : turtles) {
            System.out.println(turtle);
            turtle.ninjitsu();
        }

        // create an array of the 4 tmnt turtles
        TMNT[] tmnt = new TMNT[4];
        tmnt[0] = new TMNT("Leo", "blue");
        tmnt[1] = new TMNT("Raph", "red");
        tmnt[2] = new TMNT("Donnie", "purple");
        tmnt[3] = new TMNT("Mikey", "yellow");
        // print out the tmnt turtles and call Cowabunga
        for (TMNT turtle : tmnt) {
            System.out.println(turtle);
            turtle.Cowabunga();
        }
    }
}

public class TMNT extends NinjaTurtle {
    private Character belt;
    private Boolean lovesPizza;

    // default constructor
    public TMNT() {
        super();
        this.belt = ' ';
        this.lovesPizza = true;
    }

    // constructor that takes in a name and a mask color
    public TMNT(String name, String maskColor) {
        super(name, maskColor, 1987);
        if (name.equals("Leo")) {
            this.belt = 'L';
        } else if (name.equals("Raph")) {
            this.belt = 'R';
        } else if (name.equals("Mikey")) {
            this.belt = 'M';
        } else if (name.equals("Donnie")) {
            this.belt = 'D';
        } else {
            this.belt = ' ';
        }
        this.lovesPizza = true;
    }

    // standard getters and setters
    public Character getBelt() {
        return this.belt;
    }

    public Boolean getLovesPizza() {
        return this.lovesPizza;
    }

    public void setBelt(Character belt) {
        this.belt = belt;
    }

    public void setLovesPizza(Boolean lovesPizza) {
        this.lovesPizza = lovesPizza;
    }

    // override the toString method
    @Override
    public String toString() {
        return "Name: " + this.name + ", Mask Color: " + this.maskColor + ", Year of Origin: " + this.yearOfOrigin + ", Belt: " + this.belt + ", Loves Pizza: " + this.lovesPizza;
    }

    // override the ninjitsu method
    @Override
    public void ninjitsu() {
        String[] sayings = {"YO. It’s the green machine, going to rock the town without being seen — have you ever seen a turtle get down?",
        "Gonna rock— and roll the place with the power of the ninja turtle bass"};
        String saying = sayings[rand.nextInt(sayings.length)];
        System.out.println(saying);
    }

    public void Cowabunga() {
        super.ninjitsu();
        System.out.println("COWABUNGA!");
        System.out.println("RADICAL!");
    }
}

import java.util.Random;
public class NinjaTurtle {
    protected String name;
    protected String maskColor;
    protected int yearOfOrigin;
    protected Random rand = new Random();

    // default constructor that represents a null or blank turtle
    public NinjaTurtle() {
        this.name = "";
        this.maskColor = "";
        this.yearOfOrigin = 0;
    }

    // constructor that takes in a name, a mask color, and a year of origin
    public NinjaTurtle(String name, String maskColor, int yearOfOrigin) {
        this.name = name;
        this.maskColor = maskColor;
        this.yearOfOrigin = yearOfOrigin;
    }

    // constructor that only takes in a name
    public NinjaTurtle(String name) {
        this(name, "red", 1984);
    }

    // standard getters and setters
    public String getName() {
        return this.name;
    }

    public String getMaskColor() {
        return this.maskColor;
    }

    public int getYearOfOrigin() {
        return this.yearOfOrigin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaskColor(String maskColor) {
        this.maskColor = maskColor;
    }

    public void setYearOfOrigin(int yearOfOrigin) {
        this.yearOfOrigin = yearOfOrigin;
    }

    // override the toString method
    @Override
    public String toString() {
        return "Name: " + this.name + ", Mask Color: " + this.maskColor + ", Year of Origin: " + this.yearOfOrigin;
    }

    public void ninjitsu() {
        String[] sayings = {"If you look for happiness outside of yourself, you'll never find it. Happiness exists only within you.",
        "Possess the right thinking. Only then can one receive the gifts of strength, knowledge, and peace.",
        "Tonight you have learned the final and greatest truth of the Ninja: that ultimate mastering comes not from the body, but from the mind. Together, there is nothing your four minds cannot accomplish",
        "Running into battle without knowledge or preparation is foolish. Sometimes it is best to sit still. The answers will come."};
        String saying = sayings[rand.nextInt(sayings.length)];
        System.out.println(saying);
    }
}

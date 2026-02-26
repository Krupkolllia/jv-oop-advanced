package core.basesyntax;

public class Rectangle extends Figure {
    private final double smallerSide;
    private final double biggerSide;

    public Rectangle(String color, double smallerSide, double biggerSide) {
        super(color);
        this.smallerSide = smallerSide;
        this.biggerSide = biggerSide;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, "
                + "smaller side length: " + smallerSide
                + "bigger side length: " + biggerSide
                + " color: " + color;
    }
}

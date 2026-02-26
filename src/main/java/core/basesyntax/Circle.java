package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double area, double radius) {
        super(color, area);
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "Figure: circle, area: " + area
                + " sq. units, radius: " + radius
                + " color: " + color;
    }
}

package core.basesyntax;

public class RightTriangle extends Figure {
    private final double side;

    public RightTriangle(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public String draw() {
        return "Figure: square, "
                + "side length: " + side
                + " color: " + color;
    }
}

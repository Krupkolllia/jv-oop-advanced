package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int topBase;
    private final int bottomBase;

    public IsoscelesTrapezoid(String color, int height, int topBase, int bottomBase) {
        super(color);
        this.height = height;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, "
                + "area: " + getArea() + " sq. units, "
                + "height " + height
                + ", top base: " + topBase
                + ", bottom base: " + bottomBase
                + ", color: " + color;
    }

    @Override
    public double getArea() {
        return (double) (topBase + bottomBase) / 2 * height;
    }
}

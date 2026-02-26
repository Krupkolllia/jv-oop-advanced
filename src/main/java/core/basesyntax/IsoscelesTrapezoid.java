package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public IsoscelesTrapezoid(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, "
                + "first leg length: " + firstLeg
                + "second leg length: " + secondLeg
                + " color: " + color;
    }
}

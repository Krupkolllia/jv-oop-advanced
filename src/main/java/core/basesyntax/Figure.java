package core.basesyntax;

public abstract class Figure {
    protected String color;
    protected double area;

    public Figure(String color, double area) {
        this.color = color;
        this.area = area;
    }

    public abstract String draw();
}

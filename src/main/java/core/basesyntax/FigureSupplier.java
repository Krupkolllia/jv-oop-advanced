package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Figure[] figures = {
                new Circle(colorSupplier.getRandomColor(), random.nextDouble(100)),
        };

        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(colorSupplier.getRandomColor(), 10.0);
    }
}

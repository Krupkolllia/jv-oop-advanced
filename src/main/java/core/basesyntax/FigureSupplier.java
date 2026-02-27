package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        double randomSide = random.nextDouble(25);

        Figure[] figures = {
                new Circle(randomColor, random.nextDouble(15)),
                new Square(colorSupplier.getRandomColor(), randomSide),
                new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble(15),
                        random.nextDouble(15, 25)
                ),
                new RightTriangle(randomColor, randomSide),
                new IsoscelesTrapezoid(randomColor, randomSide, randomSide)
        };

        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), 10.0);
    }
}

package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    public static final int DEFAULT_RADIUS = 10;
    
    private static final int BOTTOM_RANDOM_BOUND = 0;
    private static final int UPPER_RANDOM_BOUND = 20;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();

        Figure[] figures = {
                new Circle(randomColor, getRandomInt()),
                new Square(randomColor, getRandomInt()),
                new Rectangle(randomColor,
                        getRandomInt(),
                        getRandomInt()
                ),
                new RightTriangle(randomColor, getRandomInt(), getRandomInt()),
                new IsoscelesTrapezoid(
                        randomColor,
                        getRandomInt(),
                        getRandomInt(),
                        getRandomInt())
        };

        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.toLowerCase(), DEFAULT_RADIUS);
    }
    
    private int getRandomInt() {
        return random.nextInt(BOTTOM_RANDOM_BOUND, UPPER_RANDOM_BOUND);
    }
}

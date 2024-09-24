package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Color getRandomColor() {
        return Color.values()[this.random.nextInt(Color.values().length)];
    }
}

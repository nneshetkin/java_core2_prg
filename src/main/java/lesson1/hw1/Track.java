package lesson1.hw1;

public class Track implements Barriers {
    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}

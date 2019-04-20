public class Main {
    public static void main(String[] args) {
        LuckyCasino luckyCasino = new LuckyCasino();
        checkEquals(7, luckyCasino.play(8, 0));
        checkEquals(6, luckyCasino.play(18, 2));
        checkEquals(4, luckyCasino.play(10, 10));
        checkEquals(0, luckyCasino.play(1, 5));
        checkEquals(1, luckyCasino.play(2, 3));
        checkEquals(22, luckyCasino.play(147, 3));
        checkEquals(13, luckyCasino.play(483, 57));
        checkEquals(14, luckyCasino.play(647, 7));
        checkEquals(85, luckyCasino.play(647, 3));
        checkEquals(0, luckyCasino.play(0, 10));
    }

    private static void checkEquals(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError(String.format("Expected %s, but actual result is %s", expected, actual));
        }
    }
}

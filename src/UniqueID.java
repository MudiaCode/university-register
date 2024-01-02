import java.util.Random;

public class UniqueID{
    private static final Random random = new Random(1);

    public static Integer generateUniqueIdentifier() {
        return random.nextInt(900000) + 100000;
    }
}


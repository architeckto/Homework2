package Home;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        counting counting = new counting();
        String[][] car = new String[4][4];
        counting.jeep(car);
        counting.calculation(car);
    }
}
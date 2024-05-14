class StringManipulatorTest {

    private static String trimAndConcat;

    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        trimAndConcat = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
        String str = trimAndConcat; //str = HolaMundo
        System.out.println(str);

    }
}
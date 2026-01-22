package test;

import main.Main;

public class Test {
    static void main() {
        // Blue
        test("blue0", true);
        test("blue1", false);
        test("blue2", false);
        test("blue3", false);
        test("blue4", true);

        // Red
        test("red0", false);
        test("red1", true);
        test("red2", false);
        test("red3", false);
        test("red4", false);
        test("red5", false);
        test("red6", false);
        test("red7", true);
        test("red8", false);

        // Black
        test("black0", false);
        test("black1", true);
        test("black2", false);
        test("black3", false);
    }

    public static void test(String name, Boolean mustFail) {
        try {
            IO.println("**** " + name);
            Main.main(new String[] {"-v", "test/" + name + ".pcf"});
            if (mustFail)
                IO.println("Test failed : program must fail but passed");
        } catch (Throwable e) {
            IO.println("Error in " + name);
            e.printStackTrace();
            if (!mustFail)
                IO.println("Test failed : program must pass but failed");
        }
    }
}

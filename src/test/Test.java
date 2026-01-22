package test;

import main.Main;

public class Test {
    public static void main(String[] args) {
        // Green (literals, arithmetic, conditionals)
        test("green0", false);  // simple literal: 42
        test("green1", false);  // arithmetic: 3 + 4 * 2 - 1
        test("green2", false);  // nested arithmetic: 10 / 2 + 3 * (4 - 1)
        test("green3", false);  // ifz true branch: ifz 0 then 1 else 2
        test("green4", false);  // ifz with computed zero: ifz 5 - 5 then 100 else 200
        test("green5", false);  // ifz false branch: ifz 1 then 10 else 20
        test("green6", true);   // division by zero: 1 / 0
        test("green7", false);  // complex: ifz 10 / 5 - 2 then 42 else 0
        test("green8", true);   // division by computed zero: 10 / (3 - 3)

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

    public static void test(String name, boolean mustFail) {
        try {
            System.out.println("**** " + name);
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

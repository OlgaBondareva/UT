package triangle;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "getMessage")
    public static Object[][] getMessage() {
        return new Object[][]{
                {"", new Triangle(1, 1, 1)},
                {"a+b<=c", new Triangle(1, 2, 3)},
                {"b+c<=a", new Triangle(7, 2, 3)},
                {"a+c<=b", new Triangle(3, 12, 4)},
                {"a<=0", new Triangle(-1, 1, 1)},
                {"b<=0", new Triangle(2, -2, 2)},
                {"c<=0", new Triangle(3, 3, -3)},
        };
    }

    @DataProvider
    public static Object[][] checkGoodTriangle() {
        return new Object[][]{
                {new Triangle(1, 1, 1)},
                {new Triangle(9, 12, 15)},
                {new Triangle(15, 15, 14)}
        };
    }

    @DataProvider
    public static Object[][] checkBadTriangle() {
        return new Object[][]{
                {new Triangle(1, 2, 3)},
                {new Triangle(6, 3, 3)},
                {new Triangle(12, 15, 3)},
                {new Triangle(7, 2, 3)},
                {new Triangle(3, 12, 4)},
                {new Triangle(9, 21, 35)},
                {new Triangle(-1, 1, 1)},
                {new Triangle(2, -2, 2)},
                {new Triangle(3, 3, -3)},
                {new Triangle(0, 5, 7)},
                {new Triangle(21, 0, 21)},
                {new Triangle(34, 25, 0)}
        };
    }

    @DataProvider
    public static Object[][] getBadSquare() {
        return new Object[][]{
                {new Triangle(7, 2, 3), "-72"},
                {new Triangle(-3, 4, 5), "-6"},
                {new Triangle(3, -4, 5), "-6"},
                {new Triangle(3, 4, -5), "-6"},
                {new Triangle(0, 0, 0), "0"}
        };
    }

    @DataProvider
    public static Object[][] getGoodSquare() {
        return new Object[][]{
                {new Triangle(3, 4, 5), "6"},
                {new Triangle(14, 14, 14), "84.870489570875"},
                {new Triangle(20, 20, 11), "105.75886487666176"},
                {new Triangle(19, 8, 13), "40.98780306383839"}
        };
    }

    //    TR_EQUILATERAL = 1; // равносторонний
//    TR_ISOSCELES = 2;   // равнобедренный
//    TR_ORDYNARY = 4;    // обычный
//    TR_RECTANGULAR = 8; // прямоугольный
    @DataProvider
    public static Object[][] detectGoodTriangle() {
        return new Object[][]{
                {new Triangle(345, 345, 345), 1},
                {new Triangle(891, 891, 615), 2},
                {new Triangle(315, 255, 315), 2},
                {new Triangle(121, 77, 77), 2},
                {new Triangle(328, 912, 587), 4},
                {new Triangle(3, 4, 5), 8},
                {new Triangle(7, 7, 9.8994949361), 8},
                {new Triangle(7, 7, 9.8994949361), 2}
        };
    }

    @DataProvider
    public static Object[][] detectBadTriangle() {
        return new Object[][]{};
    }
}

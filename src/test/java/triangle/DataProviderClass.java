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

    @DataProvider(name = "checkTriangle")
    public static Object[][] checkTriangle() {
        return new Object[][]{
                {new Triangle(1, 1, 1), true},
                {new Triangle(1, 2, 3), false},
                {new Triangle(7, 2, 3), false},
                {new Triangle(3, 12, 4), false},
                {new Triangle(-1, 1, 1), false},
                {new Triangle(2, -2, 2), false},
                {new Triangle(3, 3, -3), false},
        };
    }

    /**
     * @return new Triangle and it's type (see the Triangle.java)
     */
//    TR_EQUILATERAL = 1; // равносторонний
//    TR_ISOSCELES = 2;   // равнобедренный
//    TR_ORDYNARY = 4;    // обычный
//    TR_RECTANGULAR = 8; // прямоугольный
    @DataProvider(name = "detectTriangle")
    public static Object[][] detectTriangle() {
        return new Object[][]{
                {new Triangle(345, 345, 345), 1},
                {new Triangle(891, 891, 615), 2},
                {new Triangle(328, 912, 587), 4},
                {new Triangle(3, 4, 5), 8}
        };
    }

    /**
     * @return Triangle and it's real square
     */
    @DataProvider(name = "getSquare")
    public static Object[][] getSquare() {
        return new Object[][]{
                {new Triangle(3,4,5), 6}
        };
    }
}

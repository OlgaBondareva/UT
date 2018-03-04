package triangle;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "getMessage")
    public static Object[][] getMessage(){
        return new Object[][]{
                {"", new Triangle(1,1,1)},
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
}

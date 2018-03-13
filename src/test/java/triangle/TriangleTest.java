package triangle;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTest {


    @Test(dataProvider = "getMessage", dataProviderClass = DataProviderClass.class)
    public void testGetMessage(String message, Triangle t) {
        t.checkTriangle();
        Assert.assertEquals(t.getMessage(), message);
    }

    @Test(dataProvider = "checkGoodTriangle", dataProviderClass = DataProviderClass.class)
    public void testCheckGoodTriangle(Triangle t) {
        Assert.assertTrue(t.checkTriangle());
    }

    @Test(dataProvider = "checkBadTriangle", dataProviderClass = DataProviderClass.class)
    public void testCheckBadTriangle(Triangle t) {
        Assert.assertFalse(t.checkTriangle());
    }

    @Test(dataProvider = "detectGoodTriangle", dataProviderClass = DataProviderClass.class)
    public void testDetectGoodTriangle(Triangle t, int type) {
        Assert.assertEquals(t.detectTriangle(), type);
    }

    @Test(dataProvider = "detectBadTriangle", dataProviderClass = DataProviderClass.class)
    public void testDetectBadTriangle(Triangle t, int type) {
        Assert.assertEquals(t.detectTriangle(), type);
    }

    @Test(dataProvider = "getGoodSquare", dataProviderClass = DataProviderClass.class)
    public void testGetGoodSquare(Triangle t, String result) {
        Assert.assertEquals(t.getSquare(), Double.parseDouble(result), 0.0);
    }

    @Test(dataProvider = "getBadSquare", dataProviderClass = DataProviderClass.class, expectedExceptions = Exception.class)
    public void testGetBadSquare(Triangle t, String result) {
        Assert.assertEquals(t.getSquare(), Double.parseDouble(result));
    }
}

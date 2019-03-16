import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
    @Test
    public void testDistance() {
    Point p1 = new Point(2,3);
    Point p2 = new Point(3,4);
        Assert.assertEquals(HelloWorld.distance(p1,p2),2);
    }
    @Test
    public void test1Distance() {
        Point p1 = new Point(6,1);
        Point p2 = new Point(2,3);
        Assert.assertEquals(HelloWorld.distance(p1,p2),6);
    }
    @Test
    public void test3Distance() {
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,0);
        Assert.assertEquals(HelloWorld.distance(p1,p2),0);
    }
}


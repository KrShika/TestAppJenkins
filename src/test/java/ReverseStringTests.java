import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTests {

@Test
public void reverseTestWithNull(){
    Assert.assertNull(ReverseString.reverseString(null));
    System.out.println("reverseTestWithNull");
}

@Test
public void reverseTestWithDigit(){
    Assert.assertEquals("cba321",ReverseString.reverseString("123abc"));
    System.out.println("reverseTestWithDigit");
}

@Test
public void reverseTestHappyPath(){
    Assert.assertEquals("elppa",ReverseString.reverseString("apple"));
    System.out.println("reverseTestHappyPathHello");
}

}

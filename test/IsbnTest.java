import org.junit.Test;

import static org.junit.Assert.*;

public class IsbnTest {
    @Test
    public void checkIsbnTenDigit(){
        IsbnChecker isbn = new IsbnChecker();
      boolean result =   isbn.checkISBN("0140449116");
      assertTrue(result);
        //fail("because of you, i am failing");

    }
    @Test(expected = NumberFormatException.class)
    public void NineDigitIsbnNotAllowed (){
        IsbnChecker isbn = new IsbnChecker();
        isbn.checkISBN("123456789");
    }
    @Test(expected = NumberFormatException.class)
    public void IsEveryDigitValidNumber(){
        IsbnChecker isbn = new IsbnChecker();
        boolean result = isbn.checkISBN("helloworld");

    }
    @Test
    public void IsbnEndingInXAreValidTenDigit(){
        IsbnChecker isbn = new IsbnChecker();
        boolean result = isbn.checkISBN("012000030X");
        assertTrue(result);

    }
    @Test
    public void checkThirteenDigitValidIsbn()
    {
        IsbnChecker isbn = new IsbnChecker();
        boolean result = isbn.checkISBN("9789386691859");
        assertTrue(result);
    }

}

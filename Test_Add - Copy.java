import org.junit.Assert;
import org.junit.Test;

public class Test_Add {
    @Test
    public void T_Add(){
        Double expected = 15.0 ;
        Double actual = new Add().add(5,10);
        Assert.assertEquals(expected,actual);
    }
}

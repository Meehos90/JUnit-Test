import com.testing.OperationException;
import com.testing.Operations;
import com.testing.OperationsImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.*;

/**
 * Created by Meehos on 15.02.2017.
 */

@Title("Subtract suit")
public class SubtractTest {

    private Operations operation;

    @Before
    public void setup() {
        operation = new OperationsImpl();
    }

    @Title("check calculation")
    @Test
    @Step("addition operand1 and operand2")
    public void minus() throws Exception {
        long actual = operation.minus(15,3);
        Parameters.result(actual);
        Assert.assertEquals(12, actual);
    }

    @Title("Check borders")
    @Step("Check borders")
    @Test(expected = OperationException.class)
    public void minusMinMax() throws Exception {
        operation.minus(Parameters.operand1(Long.MIN_VALUE), Parameters.operand2(1));
    }

}

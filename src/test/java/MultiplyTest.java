import com.testing.OperationException;
import com.testing.Operations;
import com.testing.OperationsImpl;
import org.junit.*;
import ru.yandex.qatools.allure.annotations.*;

/**
 * Created by Meehos on 15.02.2017.
 */

@Title("Multiply suit")
public class MultiplyTest {
    private Operations operation;

    @Before
    public void setup() {
        operation = new OperationsImpl();
    }

    @Title("Check calculation")
    @Test
    @Step("addition operand1 and operand2")
    public void mltiply() throws Exception {

        long actual = operation.multiply(Parameters.operand1(5),Parameters.operand2(3));
        Parameters.result(actual);
        Assert.assertEquals(15, actual);

    }

    @Title("Check borders")
    @Step("Check borders")
    @Test(expected = OperationException.class)
    public void multiplyMinMax() throws Exception {
        operation.multiply(Parameters.operand1(Long.MAX_VALUE), Parameters.operand1(Long.MAX_VALUE));
    }
}

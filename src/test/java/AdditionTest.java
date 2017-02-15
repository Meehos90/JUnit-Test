/**
 * Created by Meehos on 13.02.2017.
 */
import com.testing.OperationException;
import com.testing.Operations;
import com.testing.OperationsImpl;
import org.junit.*;
import ru.yandex.qatools.allure.annotations.*;


@Title("Addition suit")
public class AdditionTest {

    private Operations operation;

    @Before
    public void setup() {
        operation = new OperationsImpl();
    }

    @Title("Check calculation")
    @Test
    @Step("addition operand1 and operand2")
    public void sum() throws Exception {
        long actual = operation.sum(Parameters.operand1(5), Parameters.operand2(7));
        Parameters.result(actual);
        Assert.assertEquals(12, actual);
    }


    @Title("Check borders")
    @Step("Check borders")
    @Test(expected = OperationException.class)
    public void sumMinMax() throws Exception {
        operation.sum(Parameters.operand1(Long.MAX_VALUE), Parameters.operand2(Long.MAX_VALUE));
    }

}

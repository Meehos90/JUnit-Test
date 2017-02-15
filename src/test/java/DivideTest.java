import com.testing.OperationException;
import com.testing.Operations;
import com.testing.OperationsImpl;
import org.junit.*;
import ru.yandex.qatools.allure.annotations.*;
/**
 * Created by Meehos on 15.02.2017.
 */


@Title("Divide suit")
public class DivideTest {

    private Operations operation;


    @Before
    public void setup() {
        operation = new OperationsImpl();
    }

    @Step("result {0}")
    private static double result(double a){
        return a;
    }

    @Title("Check calculation")
    @Test
    @Step("divide operand1 and operand2")
    public void div() throws Exception {
        double actual = operation.div(Parameters.operand1(15), Parameters.operand2(3));
        result(actual);
        Assert.assertEquals(5, actual, 0.000001);
    }

    @Title("Divide by zero")
    @Step("Divide by zero")
    @Test(expected = OperationException.class)
    public void divideZero() throws Exception {
        operation.div(Parameters.operand1(5),Parameters.operand2(0));
    }

    @Title("Check borders")
    @Step("Check borders")
    @Test(expected = OperationException.class)
    public void divMinMax() throws Exception {
        operation.div(Parameters.operand1(Long.MIN_VALUE),Parameters.operand2 (-1));

    }

}

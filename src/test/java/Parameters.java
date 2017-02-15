import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Meehos on 15.02.2017.
 */
public class Parameters {

    @Step("operand1 = {0}")

    public static long operand1(long a){
        return a;
    }

    @Step("operand2 = {0}")
    public static long operand2(long a){
        return a;
    }

    @Step("result {0}")
    public static long result(long a){
        return a;
    }


}

package com.testing;
import java.math.*;

import static java.math.BigDecimal.*;


/**
 * Created by Meehos on 14.02.2017.
 */
public class OperationsImpl implements Operations {
    public long sum(long a, long b) {
        BigDecimal add = new BigDecimal(a).add(new BigDecimal(b));

        if (add.compareTo(new BigDecimal(Long.MAX_VALUE)) > 0 || add.compareTo(new BigDecimal(Long.MIN_VALUE)) < 0 ) {
            throw new OperationException("number is not \"long\"") ;
        }

        return add.longValue();

    }

    public double div(long a, long b) {
        if (b == 0) {
            throw new OperationException("cannot divide by zero!") ;
        }
        BigDecimal divide = new BigDecimal(a).divide(new BigDecimal(b),6 ,ROUND_HALF_UP);

        if (divide.compareTo(new BigDecimal(Long.MAX_VALUE)) > 0 || divide.compareTo(new BigDecimal(Long.MIN_VALUE)) < 0 ) {
            throw new OperationException("number is not \"long\"") ;
        }
            return divide.doubleValue();
    }

    public long minus(long a, long b) {
        BigDecimal sub = new BigDecimal(a).subtract(new BigDecimal(b));

        if (sub.compareTo(new BigDecimal(Long.MIN_VALUE)) < 0 || sub.compareTo(new BigDecimal(Long.MAX_VALUE)) > 0) {
            throw new OperationException("number is not \"long\"") ;
        }

        return sub.longValue();
    }


    public long multiply(long a, long b) {
        BigDecimal multiply = new BigDecimal(a).multiply(new BigDecimal(b));

        if (multiply.compareTo(new BigDecimal(Long.MAX_VALUE)) > 0 || multiply.compareTo(new BigDecimal(Long.MIN_VALUE)) < 0 ) {
            throw new OperationException("number is not \"long\"") ;
        }
        return multiply.longValue();
    }
}

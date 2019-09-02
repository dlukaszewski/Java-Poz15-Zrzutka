package pl.sda.spring.zrzutka.model;

import java.math.BigDecimal;
import java.util.List;

public class WhiproundSum {

    private Whipround whipround;
    private BigDecimal sum;

    public WhiproundSum(Whipround whipround, BigDecimal sum) {
        this.whipround = whipround;
        this.sum = sum;
    }

    public Whipround getWhipround() {
        return whipround;
    }

    public BigDecimal getPercentage(){
        if (sum.compareTo(BigDecimal.ZERO)> 0){
            return sum.divide(whipround.getGoal()).multiply(BigDecimal.valueOf(100));
        }
        return BigDecimal.ZERO;
    }


}

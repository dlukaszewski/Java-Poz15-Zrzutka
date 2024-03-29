package pl.sda.spring.zrzutka.model;

import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class WhiproundSumTest {

    @Test
    public void shouldReturn25Percent(){
        //given
        Whipround whipround = new Whipround(BigDecimal.valueOf(200), "test");
        WhiproundSum whiproundSum = new WhiproundSum(whipround, BigDecimal.valueOf(50));

        //when
        BigDecimal actual = whiproundSum.getPercentage();
        //then
        assertThat(BigDecimal.valueOf(25).compareTo(actual)).isEqualTo(0);
    }
}

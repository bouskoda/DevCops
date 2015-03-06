package katas.tradeSorter;

import katas.tradeSorter.trade.Trade;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TradeSorterTest {

    @Test
    public void outputIdenticalToInput_whenInputContainsOneItem() {
        List<Trade> tradeList = asList(new Trade("1234", "OBS", 1, "EUR"));
        TradeSorter tradeSorter = new TradeSorter(tradeList);

        assertThat(tradeSorter.sort(), is(tradeList));
    }
}
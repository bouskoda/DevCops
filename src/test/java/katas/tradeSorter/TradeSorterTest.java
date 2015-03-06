package katas.tradeSorter;

import katas.tradeSorter.trade.Trade;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TradeSorterTest {
    private List<Trade> tradeList = new ArrayList<Trade>();

    @Test
    public void outputIdenticalToInput_whenInputContainsOneItem() {
        tradeList.add(new Trade("1234", "OBS", 1, "EUR"));
        TradeSorter tradeSorter = new TradeSorter(tradeList);

        assertThat(tradeSorter.sort(), is(tradeList));
    }

    @Test
    public void outputSortedOnTradeCurrency() {
        tradeList.add(new Trade("1234", "OBS", 1, "USD"));
        tradeList.add(new Trade("1234", "OBS", 1, "GBP"));
        TradeSorter tradeSorter = new TradeSorter(tradeList);

        List<Trade> sortedList = tradeSorter.sort();
        assertThat(sortedList.get(0).getCurrency(), is("GBP"));
    }
}
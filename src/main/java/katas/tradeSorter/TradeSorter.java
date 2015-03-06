package katas.tradeSorter;

import katas.tradeSorter.trade.Trade;

import java.util.ArrayList;
import java.util.List;

public class TradeSorter {
    private List<Trade> tradeList;

    public TradeSorter(List<Trade> tradeList) {
        this.tradeList = tradeList;
    }

    // CURRENCY ORDERING: GBP, EUR, USD
    public List<Trade> sort() {
        if (noSortingRequired()) {
            return tradeList;
        }

        List<Trade> sortedList = new ArrayList<Trade>();
        for (Trade trade : tradeList) {
            if (trade.getCurrency() == "GBP") {
                sortedList.add(trade);
            }
        }

        for (Trade trade : tradeList) {
            if (trade.getCurrency() == "EUR") {
                sortedList.add(trade);
            }
        }

        for (Trade trade : tradeList) {
            if (trade.getCurrency() == "USD") {
                sortedList.add(trade);
            }
        }

        return sortedList;
    }

    private boolean noSortingRequired() {
        return (tradeList.size() == 1);
    }
}
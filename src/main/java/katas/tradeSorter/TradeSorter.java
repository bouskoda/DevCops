package katas.tradeSorter;

import katas.tradeSorter.trade.Trade;

import java.util.ArrayList;
import java.util.List;

public class TradeSorter {
    private List<Trade> tradeList;

    public TradeSorter(List<Trade> tradeList) {
        this.tradeList = tradeList;
    }

    public List<Trade> sort() {
        if (noSortingRequired()) {
            return tradeList;
        }
        return tradesSortedOnCurrency();
    }

    // CURRENCY ORDERING: GBP, EUR, USD
    private List<Trade> tradesSortedOnCurrency() {
        List<Trade> sortedList = new ArrayList<Trade>();

        extractTradesForCurrency("GBP", sortedList);
        extractTradesForCurrency("EUR", sortedList);
        extractTradesForCurrency("USD", sortedList);

        return sortedList;
    }

    private void extractTradesForCurrency(String currency, List<Trade> sortedList) {
        for (Trade trade : tradeList) {
            if (currency.equals(trade.getCurrency())) {
                sortedList.add(trade);
            }
        }
    }

    private boolean noSortingRequired() {
        return (tradeList.size() == 1);
    }
}
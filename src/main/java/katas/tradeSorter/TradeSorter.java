package katas.tradeSorter;

import katas.tradeSorter.trade.Trade;

import java.util.List;

public class TradeSorter {
    private List<Trade> tradeList;

    public TradeSorter(List<Trade> tradeList) {
        this.tradeList = tradeList;
    }

    public List<Trade> sort() {
        return tradeList;
    }
}
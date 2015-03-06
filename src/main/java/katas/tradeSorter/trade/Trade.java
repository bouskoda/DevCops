package katas.tradeSorter.trade;

public class Trade {
    private final String id;
    private final String domain;
    private final int version;
    private final String currency;

    public Trade(String id, String domain, int version, String currency) {
        this.id = id;
        this.domain = domain;
        this.version = version;
        this.currency = currency;
    }
/*

    public String getId() {
        return id;
    }

    public String getDomain() {
        return domain;
    }

    public int getVersion() {
        return version;
    }

    public String getCurrency() {
        return currency;
    }
*/
}
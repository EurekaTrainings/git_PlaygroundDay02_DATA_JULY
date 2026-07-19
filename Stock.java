import java.math.BigDecimal;
import java.util.Objects;

public class Stock {
    private String tickerSymbol;
    private String tickerName;
    private int marketCapL;
    private Date latest_date;
    private String ticker_s;

    public Stock(String tickerSymbol,
                 String tickerName,
                 int marketCap,
                 ) {
        this.tickerSymbol = tickerSymbol;
        this.tickerName = tickerName;
        this.marketCap = marketCap;
    }

    boolean hasGoodFundamentals() {
        boolean bool = this.currentRatio > 10;
        return bool;
    }

    void print() {
        System.out.println("Ticker Symbol: " + tickerSymbol);
        System.out.println("Ticker Name: " + tickerName);
        System.out.println("Market Cap: " + marketCap);

        //Adding the comments for the for mearge conflicts
        // System.out.println("Ticker Symbol: " + tickerSymbol);
        // System.out.println("Ticker Name: " + tickerName);
        // System.out.println("Market Cap: " + marketCap);
    }

}
//No updates just checking
//No updates just checking
//No updates just checking
//No updates just checking
//No updates just checking
//No updates just checkingx
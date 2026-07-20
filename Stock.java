import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class Stock {
    private String tickerSymbol;
    private String tickerName;
    private int marketCap;
    private int openprice;
    private int closeprice;
    private Date tradingDate;
    private LocalDate tradeDate;
    private String Zipcode;
    private String Max_price;
    private String Min_price;
    private String Swaroop2;
    private String Swaroop5;
    private String Swaroopgit;
    private String SwaroopLocal;


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
    }

}

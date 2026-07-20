import java.math.BigDecimal;
import java.time.LocalDate;
import java.sql.Date;
import java.util.Objects;

public class Stock {
    private String tickerSymbol;
    private String tickername;
    private int marketCap;
    private int openprice;
    private int closeprice;
  private Date tradingdate;
    private int openPrice;
    private int closePrice;
    private Date  tradingdate;
    private double currentRatio;
    private int openprice;
    private int closeprice;
    private Date tradingdate;
    private LocalDate tradingdate;
    private string strrr;
    private int openPrice;
    private int closePrice;
    private int issueFix; //add a new private variable issueFix
    private Date tradingDate;
    private LocalDate tradingDate;
    private int pricePercentage;
    private int num;


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
// test 2

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
    private int pricePercentage23;
    private int num;
    private int branch5;//this is first commit in branch 5
    private int branch4;//this is first commit in branch4
    private int branch2; //this is 1st commit in branch2
    private int pricedrop;
    private String sectorid1;
    private int branch1; // 1st commit
    private int avgprice;
    private int num1;
    private Date tradingyear;
     private int priceclose;
    private String amazon_1;
    private int branch2.1; //this is 2nd commit in branch2
    private int branch2.1.1;

    private int branch2.1;
    private int open1;//this is 2nd commit in branch2
    private int open2;
    private int close;
    private int price2;
    private string sectorid;
    private string devep1;
    private String name;


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

    // first branch

    void print() {
        System.out.println("Ticker Symbol: " + tickerSymbol);
        System.out.println("Ticker Name: " + tickerName);
        System.out.println("Market Cap: " + marketCap);
        System.out.println("Market Cap: " + openprice);
    }
    //NJ__01

}
// test


// Commit 1 From "Datta-Branch-1"
//private int openPrice;
//private int closePrice;
//private Date  tradingdate;
//private double currentRatio;
//private int openprice;
//private int closeprice;
//private Date tradingdate;
//private LocalDate tradingdate;
//private string strrr;
//private int openPrice;
//private int closePrice;
//private int issueFix; //add a new private variable issueFix
//private Date tradingDate;
//private LocalDate tradingDate;
//private int pricePercentage;
//private int num;


//SaiRam-Commit-1

//private Date tradingDate;
//private LocalDate tradingDate;
//private int pricePercentage23;
//private int num;
//private int branch2; //this is 1st commit in branch2
//private int pricedrop;
//private int branch1; // 1st commit
//private int avgprice;
//private int priceclose;
//private String amazon_1;

import java.util.Arrays;
import java.util.Date;


public class Sales {
    private Customer customer;
    private double totalCost;
    private long saleNumber;
    private int daysForDelivery;
    private Date dateOfSale;
    private Stock[] stockItems;

    public Sales(Customer customer, double totalCost, long saleNumber, int daysForDelivery, Stock[] stockItems) {
        this.customer = customer;
        this.totalCost = totalCost;
        this.saleNumber = saleNumber;
        this.daysForDelivery = daysForDelivery;
        dateOfSale = new Date();
        this.stockItems = stockItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public long getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(long saleNumber) {
        this.saleNumber = saleNumber;
    }

    public int getDaysForDelivery() {
        return daysForDelivery;
    }

    public void setDaysForDelivery(int daysForDelivery) {
        this.daysForDelivery = daysForDelivery;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public Stock[] getStockItem() {
        return stockItems;
    }

    public void setStockItem(Stock[] stockItems) {
        this.stockItems = stockItems;
    }

    public void calcDaysForDelivery() {
        if(getCustomer().getMembership().equalsIgnoreCase("premium")) {
            daysForDelivery = 2;
        } else {
            daysForDelivery = (5 + (int)(Math.random() * 3));
        }
    }

    @Override
    public String toString() {
        return "Sales{" +
                "customer=" + customer +
                ", totalCost=" + totalCost +
                ", saleNumber=" + saleNumber +
                ", daysForDelivery=" + daysForDelivery +
                ", dateOfSale=" + dateOfSale +
                ", stockItems=" + Arrays.toString(stockItems) +
                '}';
    }
}

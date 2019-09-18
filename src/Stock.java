public class Stock {
    private String category;
    private String name;
    private double price;
    private double deliveryCost;
    private double VAT;

    public Stock(String category, String name, double price, double deliveryCost, double VAT) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.deliveryCost = deliveryCost;
        this.VAT = VAT;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }
}

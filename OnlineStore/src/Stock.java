public class Stock {
    private Category cat;
    private String name;
    private double price;
    private ItemSize size;
    private boolean isSold;

    public Stock(Category cat, String name, double price, ItemSize size) {
        this.cat = cat;
        this.name = name;
        this.price = price;
        this.size = size;
        isSold = false;
    }

    public Category getCategory() {
        return cat;
    }

    public void setCategory(Category cat) {
        this.cat = cat;
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

    public ItemSize getSize() {
        return size;
    }

    public void setSize(ItemSize size) {
        this.size = size;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    @Override
    public String toString() {
        return "Stock{" +
                cat.toString() + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                size.toString() +
                ", isSold=" + isSold +
                '}';
    }
}

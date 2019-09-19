package categories;

public class OtherCategory extends Category {
    public double calcVAT() {
        return .23;
    }

    @Override
    public String toString() {
        return "categories.Category: Other\n VAT: " + calcVAT() + "%";
    }
}

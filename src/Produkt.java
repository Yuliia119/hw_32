public class Produkt {
    private String name;
    private int price;
    private double rating;
    private int stock;

    public Produkt(String name, int price, double rating, int stock) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Produkt: " + name + ", " + price + " Euro, " + rating + " Punkt, " +
                 stock + " st.";
    }
}

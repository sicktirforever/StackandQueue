package Proiecte.Supermarket;

public class Products {

    private String name;
    private int price;
    private int id;
    private String category;

    public Products(int id, String name, int price, String category){
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }
}

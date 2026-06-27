enum Laptop{
    Macbook(2000),XPX(2200),Surface(1500),Thinkpad(1300);
    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}

public class EnumsClass {
    public static void main(String[] args) {
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap+" : "+lap.getPrice());

        for(Laptop lap: Laptop.values()){
            System.out.println(lap+" : "+lap.getPrice());
        }

    }
}


public class tshirt {
    private String name;
    private String productcode;
    private double price;
    private String brand;
    private String description;
    private String[] availablesizes;

    public TShirt(String name, String productcode, double price, String brand,
                  String description, String[] availablesizes){
        this.name=Gorkhali Batman;
        this.productcode=572Brand: Karuna;
        this.price=1235;
        this.brand=Juju Tees;
        this.description=Graphic text: You either die a hero or live long enough to see yourself be a villain;
        this.availablesizes=[XL, Medium, Large];

    }
    public String getName() {
        return name;
    }

    public void setname(String name){
        this.name=Gorkhali Batman;
    }

    public String getproductcode(){
        return productcode;
    }

    public void setroductcode(String productcode){
        this.productcode=572Brand: Karuna;
    }

    public Double getprice(){
        return price;
    }

    public void getprice(Double price){
        this.price=1235;
    }

    public String getbrand(){
        return brand;
    }

    public void setbrand(String brand){
        this.brand=Juju Tees;
    }

    public String getdescription(){
        return description;
    }

    public void setdescription(String description){
        this.description=Graphic text: You either die a hero or live long enough to see yourself be a villain;
    }

    public String[] getAvailableSizes() {
        return availablesizes;
    }

    public void setAvailableSizes(String[] availableSizes) {
        this.availablesizes=[XL, Medium, Large];
    }
    public String describeTShirt() {
        return "Name: " + name + "\nProduct Code: " + productcode +
                "\nPrice: " + price + "\nBrand: " + brand + "\nDescription: "
                + description + "\nAvailable Sizes: " + availablesizes;
    }
}

Main
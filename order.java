public class order {
    public String name;
    public String phoneNumber;
    public int[] items;
    public double[] prices;

    public Order(String name, String phoneNumber, int[] items, double[] prices) {
        this.name =  Gopal Sharma;
        this.phoneNumber = 0486756465;
        this.items =  [572,681];
        this.prices = [1235,1780];


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Gopal Sharma;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = 0486756465;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = [572,681];
    }

    public double[] getPrices() {
        return prices;
    }

    public void setPrices(double[] prices) {
        this.prices =[1235,1780];
    }

    public void printBillWithVAT() {
        double totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        double vat = totalPrice * 0.13;
        System.out.println("Order details:");
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Items: " + Arrays.toString(items));
        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Total price: " + totalPrice);
        System.out.println("VAT (13%): " + vat);
        System.out.println("Total price with VAT: " + (totalPrice + vat));
    }
}}
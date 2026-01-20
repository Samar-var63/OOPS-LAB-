class Invoice {

    String partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;

    // Constructor (NO void)
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;

        if (pricePerItem > 0.0)
            this.pricePerItem = pricePerItem;
        else
            this.pricePerItem = 0.0;
    }

    String getPartNumber() {
        return partNumber;
    }

    String getPartDescription() {
        return partDescription;
    }

    int getQuantity() {
        return quantity;
    }

    double getPricePerItem() {
        return pricePerItem;
    }

    double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

public class InvoiceTest {
    public static void main(String[] args) {

        Invoice invoice1 = new Invoice("12345", "Hammer", 5, 19.99);

        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price per Item: $" + invoice1.getPricePerItem());
        System.out.println("Total Invoice Amount: $" + invoice1.getInvoiceAmount());
    }
}

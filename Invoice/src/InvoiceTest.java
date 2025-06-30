public class InvoiceTest {
    public static void main(String[] args) {
        
        Invoice invoice1 = new Invoice("BAG001", "Bag", 5, 1200.75);

        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price per Item: ₹" + invoice1.getPricePerItem());
        System.out.println("Invoice Amount: ₹" + invoice1.getInvoiceAmount());

        System.out.println();
        Invoice invoice2 = new Invoice("LAP002", "Laptop", -2, -22.00);

        System.out.println("Part Number: " + invoice2.getPartNumber());
        System.out.println("Description: " + invoice2.getPartDescription());
        System.out.println("Quantity: " + invoice2.getQuantity());
        System.out.println("Price per Item: ₹" + invoice2.getPricePerItem());
        System.out.println("Invoice Amount: ₹" + invoice2.getInvoiceAmount());

       
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {

        double profitPercent = 0.30;
        double salesTax = 0.06;

        System.out.println("Table of Products:\n");
        System.out.println("Item #:    Item:     Price:");
        System.out.println("  1.       Pencil    $1.25");
        System.out.println("  2.       Eraser    $0.75");
        System.out.println("  3.       Notepad   $2.25");
        System.out.println("  4.       Pen       $1.75");
        System.out.println("  5.       Folder    $1.00");

        InventoryItem customerOrder = new InventoryItem();

        Scanner input = new Scanner(System.in);

        System.out.println("\nPlease enter the item number that you would like to purchase: ");
        int itemNum = input.nextInt();
        //customerOrder.setItemNumber(itemNum);


        System.out.println("Please enter the qty of the item that you would like to purchase: ");
        int itemAmount = input.nextInt();
        //customerOrder.setQuantity(itemAmount);

        switch (itemNum) {
            case 1:
                customerOrder.setItemNumber(itemNum);
                customerOrder.setQuantity(itemAmount);
                customerOrder.setCost(1.25);
                double total = customerOrder.InventoryItem(customerOrder.getItemNumber(), customerOrder.getCost(), customerOrder.getQuantity() );
                break;
            case 2:
                customerOrder.setItemNumber(itemNum);
                customerOrder.setQuantity(itemAmount);
                customerOrder.setCost(0.75);
                break;
            case 3:
                customerOrder.setItemNumber(itemNum);
                customerOrder.setQuantity(itemAmount);
                customerOrder.setCost(2.25);
                break;
            case 4:
                customerOrder.setItemNumber(itemNum);
                customerOrder.setQuantity(itemAmount);
                customerOrder.setCost(1.75);
                break;
            case 5:
                customerOrder.setItemNumber(itemNum);
                customerOrder.setQuantity(itemAmount);
                customerOrder.setCost(1.00);
                break;
        }

        double begTotalCost = InventoryItem.getTotalCost();



    }
}
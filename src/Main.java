import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");

        double itemCost = 0.00;
        double profitPercent = 0.30;
        double salesTax = 0.06;
        double subTotal = 0.00;
        double grandTotal = 0.00;

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

        customerOrder.setItemNumber(itemNum);
        customerOrder.setQuantity(itemAmount);

        /*switch (itemNum) {
            case 1:
                customerOrder.setItemNumber(itemNum);
                customerOrder.setQuantity(itemAmount);
                break;
            case 2:
                customerOrder.setItemNumber(itemNum);
                customerOrder.setQuantity(itemAmount);
                break;
            case 3:
                customerOrder.setItemNumber(itemNum);
                customerOrder.setQuantity(itemAmount);
                break;
            case 4:
                customerOrder.setItemNumber(itemNum);
                customerOrder.setQuantity(itemAmount);
                break;
            case 5:
                customerOrder.setItemNumber(itemNum);
                customerOrder.setQuantity(itemAmount);
                break;
        }*/

        InventoryItem customerOrder2 = new InventoryItem(customerOrder.getItemNumber(), customerOrder.getCost(), customerOrder.getQuantity());
        //Getting item cost from InventoyItem class
        itemCost = customerOrder.getCost();

        //Adding the 30% profit to item cost
        itemCost = itemCost + (itemCost * profitPercent);
        System.out.println("The total cost of the item after adding the 30% is: $" + df.format(itemCost) + ".");
        //used to test returning results
        //System.out.println("The total cost before taxes is: $" + df.format(itemCost) + ".");

        subTotal = itemCost * customerOrder.getQuantity();
        System.out.println("The subtotal is $" + df.format(subTotal) + ".");
        //double begTotalCost = InventoryItem.getTotalCost();

        //Calculating the 6% tax rate
        grandTotal = subTotal + (subTotal * salesTax);
        System.out.println("The grand total of the order is: $" + df.format(grandTotal) + ".");


    }
}
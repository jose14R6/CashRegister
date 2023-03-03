public class InventoryItem {

    private static int itemNumber;
    private static int quantity;
    private static double cost;
    private static double totalCost;

    InventoryItem(){
        itemNumber = 0;
        quantity = 0;
        cost = 0.00;
        totalCost = 0.00;
    }

    InventoryItem(int itemNum, double itemCost, int itemQty){
        itemNumber = itemNum;
        cost = itemCost;
        quantity = itemQty;

        setTotalCost();
    }

    public void setItemNumber(int itemNum){
        itemNumber = itemNum;
    }

    public void setQuantity(int itemQty){
        quantity = itemQty;
    }

    public void setCost(double itemCost){
        cost = itemCost;
    }

    public void setTotalCost(){
        totalCost = quantity * cost;
    }

    int getItemNumber(){
        return itemNumber;
    }

    int getQuantity(){
        return quantity;
    }

    double getCost(){
        return cost;
    }

    public static double getTotalCost() {
        return totalCost;
    }

}

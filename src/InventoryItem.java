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
        switch (itemNum) {
            case 1:
                itemNumber = itemNum;
                setCost(1.25);
                break;
            case 2:
                itemNumber = itemNum;
                setCost(0.75);
                break;
            case 3:
                itemNumber = itemNum;
                setCost(2.25);
                break;
            case 4:
                itemNumber = itemNum;
                setCost(1.75);
                break;
            case 5:
                itemNumber = itemNum;
                setCost(1.00);
                break;
        }
        //itemNumber = itemNum;
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

    double getTotalCost() {
        return totalCost;
    }

}

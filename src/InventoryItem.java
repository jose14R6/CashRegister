public class InventoryItem {

    private int itemNumber;
    private int quantity;
    private double cost;
    private double totalCost;

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
        this.itemNumber = itemNum;
    }

    public void setQuantity(int itemQty){
        this.quantity = itemQty;
    }

    public void setCost(double itemCost){
        this.cost = itemCost;
    }

    public void setTotalCost(){
        this.totalCost = this.quantity * this.cost;
        //return this.totalCost;
    }


}

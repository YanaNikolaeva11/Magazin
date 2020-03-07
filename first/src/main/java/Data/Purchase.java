package Data;

public class Purchase {
    private int idPurchase;
    private int idCustomer;

    public Purchase(int id, int idUser){
        Purchase purchase = new Purchase(id, idUser);
    }
    public int getIdPurchase() { return idPurchase; }
    public int getIdCustomer() { return idCustomer; }

    public void setIdPurchase(int id ) { idPurchase = id; }
    public void setIdCustomer(int id ) { idCustomer = id; }
}

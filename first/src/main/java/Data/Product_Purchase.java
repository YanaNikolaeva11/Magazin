package Data;

public class Product_Purchase {
    private int idRecord; //id записи
    private int idProduct;
    private int idPurchase;

    public Product_Purchase( int idRec, int id2, int id){
        Product_Purchase product_purchase = new Product_Purchase(idRec, id2, id);
    }
    public int getIdRecord(){ return idRecord; }
    public int getIdProduct(){ return idProduct; }
    public int getIdPurchase(){ return idPurchase; }

    public void setIdRecord(int idListReservation ){ idRecord = idListReservation; }
    public void setIdPurchase(int idRes){ idPurchase = idRes; }
    public void setIdProduct( int idProductRes ){ idProduct = idProductRes; }

}

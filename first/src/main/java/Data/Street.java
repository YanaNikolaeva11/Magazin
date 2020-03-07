package Data;

public class Street {
    private int idStreet;
    private String nameStreet;
    private int idCity;

    public Street( int id, String name, int id2){
        Street street = new Street(id, name, id2);
    }
    public int getIdStreet() { return idStreet; }
    public void setIdStreet(int idStreet) { this.idStreet = idStreet; }
    public int getIdCity() { return idCity; }
    public void setIdCity(int idCity) { this.idCity = idCity; }
    public String getNameStreet() { return nameStreet; }
    public void setNameStreet(String nameStreet) { this.nameStreet = nameStreet; }

}

package Data;

public class Country {
    private int idCountry;
    private String nameCountry;

    public Country(int id, String name){
        Country country = new Country(id, name);
    }
    public int getIdCountry() { return idCountry; }
    public void setIdCountry(int idCountry) { this.idCountry = idCountry; }

    public String getNameCountry() { return nameCountry; }
    public void setNameCountry(String nameCountry) { this.nameCountry = nameCountry; }
}

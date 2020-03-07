package Data;

public class City {
    private int idCity;
    private String nameCity;
    private int idCountry;

    public City (int id, String name, int idCountryUser){
        City city = new City (id, name, idCountryUser);
    }

    public int getIdCity() { return idCity; }
    public void setIdCity(int idCity) { this.idCity = idCity; }
    public int getIdCountry() { return idCountry; }
    public void setIdCountry( int IdCountry) { this.idCountry = IdCountry; }
    public String getNameCity() { return nameCity; }
    public void setNameCity(String city) { this.nameCity = city; }
}

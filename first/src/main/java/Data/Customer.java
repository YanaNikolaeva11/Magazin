package Data;

public class Customer {
    private int idCustomer;
    private int idCounty;
    private String password;
    private String name;
    private String surname;
    private String patronymic;
    private String gender;
    private String role;


    public Customer(int idUser, int idCountryUser, String passwordUser, String nameUser,
                    String surnameUser, String patronymicUser, String genderUser, String roleUser){
        Customer customer = new Customer(idUser, idCountryUser, passwordUser, nameUser,surnameUser, patronymicUser, genderUser, roleUser);
    }
    public int getIdCustomer() { return idCustomer; }
    public void setIdCustomer(int idCustomer) { this.idCustomer = idCustomer; }

    public int getIdCounty() { return idCounty; }
    public void setIdCounty(int idCounty) { this.idCounty = idCounty; }

    public String getSurname() { return surname;}
    public void setSurname(String surname) { this.surname = surname; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPatronymic() { return patronymic; }
    public void setPatronymic(String patronymic) { this.patronymic = patronymic; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}

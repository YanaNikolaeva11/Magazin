package DBconnection;

import Data.Product;

import java.sql.*;
import java.util.ArrayList;

public class ProductDataBase {
    private static String url = "jdbc:mysql://localhost:3306/shopdatabase?serverTimezone=UTC";
    private static String username = "root";
    private static String password = "1999";

    public static ArrayList<Product> select() {
        ArrayList<Product> products = new ArrayList<Product>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();;
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM product");
                while(resultSet.next()){
                    int idProduct = resultSet.getInt(1);
                    int idCategory = resultSet.getInt(2);
                    String name = resultSet.getString(3);
                    int price = resultSet.getInt(4);
                    int rating = resultSet.getInt(5);
                    Product product = new Product(idProduct, idCategory, name, price, rating);
                    products.add(product);
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return products;
    }

    public static Product selectOne(int id) {
        Product product = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                String sql = "SELECT * FROM product WHERE idProduct=?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(1, id);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if(resultSet.next()){
                        int idProduct = resultSet.getInt(1);
                        int idCategory = resultSet.getInt(2);
                        String name = resultSet.getString(3);
                        int price = resultSet.getInt(4);
                        int rating = resultSet.getInt(5);
                        product = new Product(idProduct, idCategory, name, price, rating);
                    }
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return product;
    }
    public static int insert(Product product) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                String sql = "INSERT INTO product (idCategory, name, price, rating ) Values (?, ?, ?, ?)";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(2, product.getIdCategory());
                    preparedStatement.setString(3, product.getName());
                    preparedStatement.setInt(4, product.getPrice());
                    preparedStatement.setDouble(5,product.getRating());
                    return  preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return 0;
    }

    public static int update(Product product) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                String sql = "UPDATE product SET idCategory = ?, name = ?, price = ?, rating = ?" +
                        " WHERE idProduct = ?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(1, product.getIdProduct());
                    preparedStatement.setInt(2, product.getIdCategory());
                    preparedStatement.setString(3, product.getName());
                    preparedStatement.setInt(4, product.getPrice());
                    preparedStatement.setDouble(5,product.getRating());
                    return  preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return 0;
    }
    public static int delete(int id) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                String sql = "DELETE FROM product WHERE idProduct = ?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(1, id);
                    return  preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return 0;
    }
}

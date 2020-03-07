package Data;

public class Category {
    private int idCategory;
    private String nameCategory;

    public Category ( int id, String name){
        Category category = new Category( id, name);
    }
    public int getIdCategory(){ return idCategory; }
    public String getNameCategory(){ return nameCategory; }

    public void setNameCategory( int idCategoryProduct ){ idCategory = idCategoryProduct; }
    public void setNameCategory( String nameCategoryProduct){ nameCategory = nameCategoryProduct; }


}

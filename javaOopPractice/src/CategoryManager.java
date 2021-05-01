public class CategoryManager {

    public void addCategory(Category category){
        System.out.println(category.cName+" isimli kategori eklenmitir.");
    };

    public void deleteCategory(Category category){
        System.out.println(category.cName+" isimli kategori silinmistir.");
    };

    public void updateCategory(Category category){
        System.out.println(category.cName+" isimli kategori guncellenmistir.");
    };

    public void getCategories(Category[] categories){
        System.out.println("\nCategory List");
        for (Category category : categories) {
            System.out.println(category.cId+" "+ category.cName);
        }

    };
}

package B_Basics.DataTypes.NonPrimitive;

public class ClassDataType {
    public static void main(String[] args) {
     Book book = new Book();
     book.name = "test";
     book.price = 300L;
        System.out.println(book);
    }
}

class Book{
    String name;
    Long price;

    @Override
    public String toString() {
        return "Name of book is " + name + "and price is " + price;
    }
}
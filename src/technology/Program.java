package technology;

public class Program {

    public static void main(String[] args) {

        Laptop acer = new Laptop("Aspire 3", 2021, 299, 15.6, "Acer" );
        System.out.println(acer.isForGaming());
        System.out.println(acer.laptopForCoding());
        System.out.println(acer.onSound());
    }
}

package Example_2;

public class Client {
    public static void main(String []args){
        Phone iphone14=AppleStore.getPhone("IPhone14");
        System.out.println(iphone14.getdescription());
        System.out.println(iphone14.getPrice());
        System.out.println();
        Phone iphone13=AppleStore.getPhone("IPhone13");
        System.out.println(iphone13.getdescription());
        System.out.println(iphone13.getPrice());
    }
}

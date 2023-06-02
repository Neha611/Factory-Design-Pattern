package Example_2;

import java.util.Objects;

public class AppleStore {
    public static Phone getPhone(String name){
        if(Objects.equals(name,"IPhone14"))
            return new IPhone14();
        else if (Objects.equals(name,"IPhone14Pro"))
            return new IPhone14Pro();
        else if (Objects.equals(name,"IPhone14ProMax"))
            return new IPhone14ProMax();
        else
            return new UnavailablePhone();
    }
}

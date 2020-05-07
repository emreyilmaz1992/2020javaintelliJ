package day34_Custom_Class;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_Dog_Object {
    public static void main(String[] args) {


        Dog dog1 = new Dog();
        dog1.setDogInfo("Husky","big",5,"black","Marty");
        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.setDogInfo("Shepperd","small",5,"blue","Rick");
        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setDogInfo("poodle","normal",1,"white","Jerry");
        System.out.println(dog3);

        Dog dog4 = new Dog();
        dog4.setDogInfo("Boo","very small",2,"orange","Marta");
        System.out.println("===============================================================");

        ArrayList<Dog> puppies = new ArrayList<>();


        puppies.addAll(Arrays.asList(dog1,dog2,dog3,dog4));
        puppies.removeIf(p -> p.age>2);
        for (int i = 0; i <puppies.size() ; i++) {

            System.out.println(puppies.get(i));

        }

        System.out.println("=============================");







    }
}

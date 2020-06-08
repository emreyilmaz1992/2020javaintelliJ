package day48_abstraction;

public class PhoneObject {

    public static void main(String[] args) {

        iphone Iphone = new iphone("X",1000,"10 inches");

        Iphone.calling(59499219);
        Iphone.texting(41241233);

        Iphone.faceTiming(92392932);

        System.out.println(Iphone);


    }
}

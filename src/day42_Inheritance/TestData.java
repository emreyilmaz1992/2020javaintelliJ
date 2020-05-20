package day42_Inheritance;

import Repl_It0001.Test;

public class TestData extends Data {
    /*
        public    : Accessible at everywhere, visible to the world\
        default   : Only visible in the same package
        private   : Only visible within the same class
        protected : Visible in the same package, visible in sub class outside package
     */
    // public, default, protected are inherited


    public static void main(String[] args) {

        System.out.println(TestData.publicData);
        System.out.println(TestData.protectedData);
        System.out.println(TestData.defaultData);
       // System.out.println(TestData.privateData); how dare you

        // check Resources -> Inheritance






    }
}

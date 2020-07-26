package muratdeneme;

import java.util.ArrayList;
import java.util.Arrays;

public class aaaa {
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));

        for (int i = 0; i <list.size() ; i++) {


            list.removeIf(p->p<4);

        }


    }

}

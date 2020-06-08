package muratdeneme;

public class asad {
    public static String frequencyOfCharcters(String str){// "!gk4ll5 b"

        String result="";

        for (int i=0;i<str.length();i++){
            char k=str.charAt(i);
            int count=0;
            for (int l=0;l<str.length();l++){
                char o=str.charAt(l);

                if (k==o){
                    count++;
                }
            }
            if(!result.contains(k+"")){
                result+=""+k+""+count+" ";
            }
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(frequencyOfCharcters(" mmm     uuuu     ttt      uu    ooo,,,,   ..."));
    }
}

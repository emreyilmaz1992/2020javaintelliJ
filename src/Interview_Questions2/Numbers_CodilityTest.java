package Interview_Questions2;

public class Numbers_CodilityTest {
    public static void main(String[] args) {

        int n = 30;

        solution(30);







    }
    public static void solution(int n){
        String result = "";
        for (int i = 1; i < n; i++) {


            if (n % 30 == 0) {
                result += "CodilityTestCoders ";
            } else if (n % 6 == 0) {
                result += "CodilityTest ";
            } else if (n % 10 == 0) {
                result += "CodilityCoders ";
            } else if (n % 15 == 0) {
                result += "TestCoders ";
            }else if(n % 2 ==0){
                result+="Codility ";
            }else if(n % 3 ==0){
                result+="Test ";
            }else if(n % 5 == 0){
                result+= "Coders";
            }
            else {
                result += i+" ";
            }

        }



    }
}

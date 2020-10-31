package Resources;

import java.util.*;

class Solution {




    public int solution(String S) {
       
            /*
    b 1
    a 1
    l 2
    o 2
    n 1
     */
        Map<Character,Integer> listOfFrequency=new LinkedHashMap();
        for (int i=0;i<S.length();i++){
            listOfFrequency.put(Character.valueOf(S.charAt(i)), Collections.frequency(new ArrayList<Character>(){{for (Character e:S.toCharArray())add(e);}},S.charAt(i)));
        }
        int count=0;
        while ( (listOfFrequency.get('B')>0) &&
                (listOfFrequency.get('A')>0) &&
                (listOfFrequency.get('L')>1) &&
                (listOfFrequency.get('O')>1) &&
                (listOfFrequency.get('N')>0)
        ) {
            for (Character eachKey : listOfFrequency.keySet()) {
                switch (eachKey) {
                    case 'B':
                        listOfFrequency.replace(eachKey, (listOfFrequency.get(eachKey) - 1));
                        break;
                    case 'A':
                        listOfFrequency.replace(eachKey, (listOfFrequency.get(eachKey) - 1));
                        break;
                    case 'L':
                        listOfFrequency.replace(eachKey, (listOfFrequency.get(eachKey) - 2));
                        break;
                    case 'O':
                        listOfFrequency.replace(eachKey, (listOfFrequency.get(eachKey) - 2));
                        break;
                    case 'N':
                        listOfFrequency.replace(eachKey, (listOfFrequency.get(eachKey) - 1));
                        break;
                    default:
                }
            }
            count++;
        }
        return count;
    }
}

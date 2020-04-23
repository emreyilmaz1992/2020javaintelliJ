package aye001;
import java.util.Scanner;
public class Deneme02 {
    public static void main(String[] args) {
        //DO NOT CHANGE

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter status code:");
        int status = scan.nextInt();
        String abc = "";
        //WRITE YOUR CODE HERE
        switch (status){
            case 200:
                abc ="OK";
                break;
            case 201:
                abc ="Created";
                break;
            case 202:
                abc ="Accepted";
                break;
            case 301:
                abc ="Moved Permanently";
                break;
            case 303:
                abc ="See Other";
                break;
            case 304:
                abc ="Not Modified";
                break;
            case 307:
                abc ="Temporary Redirect";
                break;
            case 400:
                abc ="Bad Request";
                break;
            case 401:
                abc ="Unauthorized";
                break;
            case 403:
                abc ="Forbidden";
                break;
            case 404:
                abc ="Not Found";
                break;
            case 410:
                abc ="Gone";
                break;
            case 500:
                abc ="Internal Server Error";
                break;
            case 503:
                abc ="Service Unavailable";
                break;
            default:
                abc ="Invalid Status code!";


        } System.out.println(abc);


    }
}

package Replit_Custom_Methods.Phone;

public class CameraPhone extends Phone {
    int imageSize;
    int memorySize;

    public CameraPhone(int imageSize, int memorySize){
        this.imageSize = imageSize;
        this.memorySize = memorySize;

    }
    public int numPictures(){

        int result=0;

        result = (memorySize*1000)/imageSize;

        return result;


    }


}

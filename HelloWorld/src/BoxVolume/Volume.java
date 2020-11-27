package BoxVolume;

/**
 *
 * @author vhag9
 */
public class Volume {
    private int height;
    private int width;
    private int lenght;
    
    public Volume(){
    }
    
    public Volume(int height, int width, int lenght){
        this.height = height;
        this.width = width;
        this.lenght = lenght;
    }
    
    public int volumeBoxCalculator(){
        return height * width * lenght;
    }
}

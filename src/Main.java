import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<SmartTv> tienda =new ArrayList<>();
        tienda.add(new SmartTv("samsung",32,1080,5000));
        System.out.println(tienda);
        tienda.add(new SmartTv("lg",50,1080,10000));
        System.out.println(tienda);
        tienda.add(new SmartTv("roku",32,720,25000));
        System.out.println(tienda);
    }
}
package proyectop2;
import java.lang.Integer;


public class Conversion {
    
    public String hexa(int n){
        
        return Integer.toHexString(n).toUpperCase();
    }
    
    public String octal(int n){
       
        return Integer.toOctalString(n);
    }
    
    public String bin(int n){
        
        return Integer.toBinaryString(n);
    }
}

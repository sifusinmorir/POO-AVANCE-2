
package convertidormedidas;

public class ConvertidorMedidas {
    
    public static void main(String[] args) {
        
        double metros = 5;
        double pies = ConvertidorLongitud.metrosAcentimetros(metros);
        System.out.println(metros + " metros son equivalentes a " + pies + " centimetros.");
    }
}


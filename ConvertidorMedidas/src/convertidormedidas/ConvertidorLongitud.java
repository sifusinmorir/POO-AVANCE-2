package convertidormedidas;

public class ConvertidorLongitud {
    public static double metrosAcentimetros(double metros) {
        return metros * 100;
    }
    public static double centimetrosApulgadas(double centimetros) {
        return centimetros / 2.54;
    }
    public static double piesAmetros(double pies) {
        return pies * 0.3048;
    }
}


package convertidormedidas;

public class ConvertidorVolumen {
    public static double litrosAmetrosCubicos(double litros) {
        return litros / 1000;
    }
    public static double galonesAlitros(double galones) {
        return galones * 3.78541;
    }
    public static double onzasAlitros(double onzas) {
        return onzas / 33.814;
    }
}


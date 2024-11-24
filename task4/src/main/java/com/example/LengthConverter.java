public class LengthConverter {
    // Константы для перевода
    private static final double MM_TO_CM = 0.1;
    private static final double MM_TO_DM = 0.01;
    private static final double MM_TO_M = 0.001;
    private static final double MM_TO_KM = 0.000001;
    
    public static double mmToCm(double mm) {
        return mm * MM_TO_CM;
    }

    public static double mmToDm(double mm) {
        return mm * MM_TO_DM;
    }

    public static double mmToM(double mm) {
        return mm * MM_TO_M;
    }

    public static double mmToKm(double mm) {
        return mm * MM_TO_KM;
    }

    public static double cmToMm(double cm) {
        return cm / MM_TO_CM;
    }

    public static double cmToDm(double cm) {
        return cm * 0.1;
    }

    public static double cmToM(double cm) {
        return cm * 0.01;
    }

    public static double cmToKm(double cm) {
        return cm * 0.00001;
    }

    public static double dmToMm(double dm) {
        return dm * 10;
    }

    public static double dmToCm(double dm) {
        return dm * 10;
    }

    public static double dmToM(double dm) {
        return dm * 0.1;
    }

    public static double dmToKm(double dm) {
        return dm * 0.0001;
    }

    public static double mToMm(double m) {
        return m * 1000;
    }

    public static double mToCm(double m) {
        return m * 100;
    }

    public static double mToDm(double m) {
        return m * 10;
    }

    public static double mToKm(double m) {
        return m * 0.001;
    }

    public static double kmToMm(double km) {
        return km * 1000000;
    }

    public static double kmToCm(double km) {
        return km * 100000;
    }

    public static double kmToDm(double km) {
        return km * 10000;
    }

    public static double kmToM(double km) {
        return km * 1000;
    }
}

package today.jvm;

/**
 * Examples of Java ternary operator in action.
 * 
 * @author Arturs Licis
 */
public class TernaryOperatorExamples {
    public static void main(String[] args) {
        // to avoid 'dead code' warnings
        boolean _true = true;

        /* Primitives */
        System.out.print("Example (P-0) -- int/int:\n\t");
        System.out.println(getClazz(_true ? 1 : 2));

        System.out.print("Example (P-1) -- byte/short:\n\t");
        System.out.println(getClazz(_true ? (byte) 1 : (short) 2));

        System.out.print("Example (P-2) -- byte/char:\n\t");
        System.out.println(getClazz(_true ? (byte) 1 : (char) 2));

        System.out.print("Example (P-3) -- byte/int (2):\n\t");
        System.out.println(getClazz(_true ? (byte) 1 : (int) 2));

        System.out.print("Example (P-4) -- byte/int (128):\n\t");
        System.out.println(getClazz(_true ? (byte) 1 : (int) 128));

        System.out.print("Example (P-5) -- char/int (2):\n\t");
        System.out.println(getClazz(_true ? (char) 1 : (int) 2));

        System.out.print("Example (P-6) -- char/int (65536):\n\t");
        System.out.println(getClazz(_true ? (char) 1 : (int) 65536));

        System.out.print("Example (P-7) -- double/short:\n\t");
        System.out.println(getClazz(_true ? 1d : (short) 2));

        // System.out.print("Example (P-8) -- boolean/byte:\n\t");
        // System.out.println(getClazz(_true ? true : (byte) 1));

        /* Wrappers */
        System.out.print("Example (W-0) -- Double/Double:\n\t");
        System.out.println(getClazz(_true ? new Double(1) : new Double(2)));

        System.out.print("Example (W-1) -- Integer/Double:\n\t");
        System.out.println(getClazz(_true ? new Integer(1) : new Double(2)));

        System.out.print("Example (W-2) -- Character/Integer (2):\n\t");
        System.out.println(getClazz(_true ? Character.valueOf((char)1) : Integer.valueOf(2)));

        System.out.print("Example (W-3) -- Character/Integer (65536):\n\t");
        System.out.println(getClazz(_true ? Character.valueOf((char) 1) : Integer.valueOf(65536)));

        System.out.print("Example (W-4) -- short/Integer:\n\t");
        System.out.println(getClazz(_true ? (short) 1 : Integer.valueOf(2)));

        System.out.print("Example (W-5) -- Integer/Integer (null):\n\t");
        System.out.println(getClazz(_true ? (Integer) null : Integer.valueOf(1)));

        System.out.print("Example (W-6) -- short/Integer (null):\n\t");
        System.out.println(getClazz(_true ? (short) 1 : (Integer) null));

        System.out.print("Example (W-7) -- Integer (null)/Double:\n\t");
        System.out.println(getClazz(_true ? (Integer) null : Double.valueOf(1d)));
    }

    /* Overloaded helper methods to retrieve the class */
    public static Class<?> getClazz(boolean x) {
        return boolean.class;
    }

    public static Class<?> getClazz(byte x) {
        return byte.class;
    }

    public static Class<?> getClazz(short x) {
        return short.class;
    }

    public static Class<?> getClazz(char x) {
        return char.class;
    }

    public static Class<?> getClazz(int x) {
        return int.class;
    }

    public static Class<?> getClazz(long x) {
        return long.class;
    }

    public static Class<?> getClazz(float x) {
        return float.class;
    }

    public static Class<?> getClazz(double x) {
        return double.class;
    }

    public static Class<?> getClazz(Boolean x) {
        return Boolean.class;
    }

    public static Class<?> getClazz(Byte x) {
        return Byte.class;
    }

    public static Class<?> getClazz(Short x) {
        return Short.class;
    }

    public static Class<?> getClazz(Character x) {
        return Character.class;
    }

    public static Class<?> getClazz(Integer x) {
        return Integer.class;
    }

    public static Class<?> getClazz(Long x) {
        return Long.class;
    }

    public static Class<?> getClazz(Float x) {
        return Float.class;
    }

    public static Class<?> getClazz(Double x) {
        return Double.class;
    }
}

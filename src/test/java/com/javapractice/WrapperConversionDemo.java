package com.javapractice;

public class WrapperConversionDemo {
    public static void main(String[] args) {
        // ======= CHARACTER =======
        Character ch = Character.valueOf('A');
        System.out.println("Character: " + ch);                          // A
        System.out.println("isLetter: " + Character.isLetter(ch));      // true
        System.out.println("toLowerCase: " + Character.toLowerCase(ch)); // a

        // ======= INTEGER =======
        Integer intObj = Integer.valueOf("123");
        int intVal = intObj.intValue();                      // 123
        long intToLong = intObj.longValue();                 // 123
        double intToDouble = intObj.doubleValue();           // 123.0
        System.out.println("\nInteger Object: " + intObj);
        System.out.println("To long: " + intToLong);
        System.out.println("To double: " + intToDouble);

        // ======= DOUBLE =======
        Double doubleObj = Double.valueOf("456.78");
        double dblVal = doubleObj.doubleValue();             // 456.78
        int doubleToInt = doubleObj.intValue();              // 456
        float doubleToFloat = doubleObj.floatValue();        // 456.78f
        System.out.println("\nDouble Object: " + doubleObj);
        System.out.println("To int: " + doubleToInt);
        System.out.println("To float: " + doubleToFloat);

        // ======= FLOAT =======
        Float floatObj = Float.valueOf("99.9");
        float floatVal = floatObj.floatValue();              // 99.9
        int floatToInt = floatObj.intValue();                // 99
        double floatToDouble = floatObj.doubleValue();       // 99.9
        System.out.println("\nFloat Object: " + floatObj);
        System.out.println("To int: " + floatToInt);
        System.out.println("To double: " + floatToDouble);

        // ======= LONG =======
        Long longObj = Long.valueOf("1000000");
        long longVal = longObj.longValue();                  // 1000000
        int longToInt = longObj.intValue();                  // 1000000
        System.out.println("\nLong Object: " + longObj);
        System.out.println("To int: " + longToInt);

        // ======= SHORT =======
        Short shortObj = Short.valueOf("32000");
        short shortVal = shortObj.shortValue();              // 32000
        int shortToInt = shortObj.intValue();                // 32000
        System.out.println("\nShort Object: " + shortObj);
        System.out.println("To int: " + shortToInt);

        // ======= BYTE =======
        Byte byteObj = Byte.valueOf("100");
        byte byteVal = byteObj.byteValue();                  // 100
        int byteToInt = byteObj.intValue();                  // 100
        System.out.println("\nByte Object: " + byteObj);
        System.out.println("To int: " + byteToInt);

        // ======= BOOLEAN =======
        Boolean boolObj = Boolean.valueOf("true");
        boolean boolVal = boolObj.booleanValue();            // true
        System.out.println("\nBoolean Object: " + boolObj);
        System.out.println("booleanValue: " + boolVal);

        // ======= Character -> Numeric =======
        char numChar = '8';
        int numericValue = Character.getNumericValue(numChar); // 8
        System.out.println("\nCharacter.getNumericValue('8'): " + numericValue);

        // ======= Common toString(), equals(), compareTo() =======
        System.out.println("\n--- Common Methods ---");
        System.out.println("intObj.toString(): " + intObj.toString());        // "123"
        System.out.println("doubleObj.equals(456.78): " + doubleObj.equals(456.78)); // true
        System.out.println("intObj.compareTo(100): " + intObj.compareTo(100)); // 1
        System.out.println("floatObj.equals(99.9f): " + floatObj.equals(99.9f)); // true

        // ======= Parse Methods from String =======
        System.out.println("\n--- Parse Methods ---");
        int parsedInt = Integer.parseInt("77");
        double parsedDouble = Double.parseDouble("88.88");
        boolean parsedBoolean = Boolean.parseBoolean("true");
        System.out.println("Parsed int: " + parsedInt);              // 77
        System.out.println("Parsed double: " + parsedDouble);        // 88.88
        System.out.println("Parsed boolean: " + parsedBoolean);      // true
    }
}


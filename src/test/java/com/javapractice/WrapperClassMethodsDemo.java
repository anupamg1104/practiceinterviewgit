package com.javapractice;

public class WrapperClassMethodsDemo {
    public static void main(String[] args) {
        // Character methods
        char ch = 'A';
        System.out.println("isDigit: " + Character.isDigit(ch)); // false
        System.out.println("isLetter: " + Character.isLetter(ch)); // true
        System.out.println("isLetterOrDigit: " + Character.isLetterOrDigit(ch)); // true
        System.out.println("isWhitespace: " + Character.isWhitespace(' ')); // true
        System.out.println("isUpperCase: " + Character.isUpperCase(ch)); // true
        System.out.println("isLowerCase: " + Character.isLowerCase(ch)); // false
        System.out.println("toUpperCase: " + Character.toUpperCase('b')); // B
        System.out.println("toLowerCase: " + Character.toLowerCase('D')); // d
        System.out.println("getNumericValue: " + Character.getNumericValue('7')); // 7
        System.out.println("digit (base 16): " + Character.digit('A', 16)); // 10
        System.out.println("forDigit: " + Character.forDigit(10, 16)); // 'a'

        // Integer methods
        int num = Integer.parseInt("123");
        Integer intObj = Integer.valueOf("123");
        System.out.println("\nparseInt: " + num); // 123
        System.out.println("valueOf: " + intObj); // 123
        System.out.println("toBinaryString: " + Integer.toBinaryString(num)); // 1111011
        System.out.println("toHexString: " + Integer.toHexString(num)); // 7b
        System.out.println("toOctalString: " + Integer.toOctalString(num)); // 173
        System.out.println("compare: " + Integer.compare(10, 20)); // -1
        System.out.println("compareTo: " + intObj.compareTo(120)); // 1
        System.out.println("intValue: " + intObj.intValue()); // 123
        System.out.println("bitCount: " + Integer.bitCount(15)); // 4 (1111)
        System.out.println("highestOneBit: " + Integer.highestOneBit(10)); // 8
        System.out.println("lowestOneBit: " + Integer.lowestOneBit(10)); // 2
        System.out.println("reverse: " + Integer.reverse(13)); // e.g., 2952790016
        System.out.println("rotateLeft: " + Integer.rotateLeft(8, 2)); // 32
        System.out.println("rotateRight: " + Integer.rotateRight(8, 2)); // 2

        // Double methods
        Double d = Double.parseDouble("123.456");
        Double dObj = Double.valueOf("123.456");
        System.out.println("\nparseDouble: " + d); // 123.456
        System.out.println("valueOf: " + dObj); // 123.456
        System.out.println("isNaN: " + Double.isNaN(dObj)); // false
        System.out.println("isInfinite: " + Double.isInfinite(dObj)); // false
        System.out.println("compare: " + Double.compare(3.14, 2.71)); // 1
        System.out.println("compareTo: " + dObj.compareTo(120.0)); // 1
        System.out.println("doubleValue: " + dObj.doubleValue()); // 123.456

        // Float methods
        Float f = Float.parseFloat("10.5");
        Float fObj = Float.valueOf("10.5");
        System.out.println("\nparseFloat: " + f); // 10.5
        System.out.println("valueOf: " + fObj); // 10.5
        System.out.println("isNaN: " + Float.isNaN(fObj)); // false
        System.out.println("isInfinite: " + Float.isInfinite(fObj)); // false
        System.out.println("compareTo: " + fObj.compareTo(10.0f)); // 1

        // Short methods
        Short s = Short.parseShort("100");
        Short sObj = Short.valueOf("100");
        System.out.println("\nparseShort: " + s); // 100
        System.out.println("valueOf: " + sObj); // 100
        System.out.println("compareTo: " + sObj.compareTo((short) 50)); // 1
        System.out.println("shortValue: " + sObj.shortValue()); // 100

        // Long methods
        Long l = Long.parseLong("100000");
        Long lObj = Long.valueOf("100000");
        System.out.println("\nparseLong: " + l); // 100000
        System.out.println("valueOf: " + lObj); // 100000
        System.out.println("compareTo: " + lObj.compareTo(50000L)); // 1
        System.out.println("longValue: " + lObj.longValue()); // 100000

        // Byte methods
        Byte b = Byte.parseByte("10");
        Byte bObj = Byte.valueOf("10");
        System.out.println("\nparseByte: " + b); // 10
        System.out.println("valueOf: " + bObj); // 10
        System.out.println("compareTo: " + bObj.compareTo((byte) 5)); // 1
        System.out.println("byteValue: " + bObj.byteValue()); // 10

        // Boolean methods
        Boolean bool1 = Boolean.parseBoolean("true");
        Boolean boolObj = Boolean.valueOf("true");
        System.out.println("\nparseBoolean: " + bool1); // true
        System.out.println("valueOf: " + boolObj); // true
        System.out.println("compareTo: " + boolObj.compareTo(Boolean.FALSE)); // 1
        System.out.println("booleanValue: " + boolObj.booleanValue()); // true

        // Common: toString and equals
        System.out.println("\nCommon Methods:");
        System.out.println("intObj.toString(): " + intObj.toString()); // "123"
        System.out.println("intObj.equals(123): " + intObj.equals(123)); // true
        System.out.println("dObj.toString(): " + dObj.toString()); // "123.456"
        System.out.println("dObj.equals(123.456): " + dObj.equals(123.456)); // true
    }
}


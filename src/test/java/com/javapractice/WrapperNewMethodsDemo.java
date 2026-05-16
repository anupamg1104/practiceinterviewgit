package com.javapractice;

import java.util.Optional;

public class WrapperNewMethodsDemo {
	public static void main(String[] args) {

		// ===== Optional with Wrapper (Java 8) =====
		Optional<Integer> optionalInt = Optional.ofNullable(42);
		optionalInt.ifPresent(val -> System.out.println("Optional value: " + val)); // 42

		Optional<Double> optionalDouble = Optional.ofNullable(null);
		System.out.println("Optional Double present? " + optionalDouble.isPresent()); // false

		// ===== Unsigned Arithmetic (Java 8) =====
		int negativeInt = -1;
		long unsignedLong = Integer.toUnsignedLong(negativeInt);
		System.out.println("Unsigned long of -1: " + unsignedLong); // 4294967295

		int divUnsigned = Integer.divideUnsigned(10, 3);
		int remUnsigned = Integer.remainderUnsigned(10, 3);
		System.out.println("Unsigned division: " + divUnsigned); // 3
		System.out.println("Unsigned remainder: " + remUnsigned); // 1

		// Compare unsigned
		int comp = Integer.compareUnsigned(-1, 1);
		System.out.println("Compare unsigned (-1 vs 1): " + comp); // 1

		// ===== Static hashCode methods (Java 8/9) =====
		int intHash = Integer.hashCode(123);
		long longHash = Long.hashCode(10000000000L);
		double doubleHash = Double.hashCode(99.99);
		System.out.println("HashCode of 123 (int): " + intHash); // 123
		System.out.println("HashCode of 10_000_000_000L (long): " + longHash);
		System.out.println("HashCode of 99.99 (double): " + doubleHash);

		// ===== Boxed toString, compareTo, equals =====
		Integer intObj = 100;
		Integer intObj2 = 200;
		System.out.println("intObj.toString(): " + intObj.toString()); // "100"
		System.out.println("intObj.equals(100): " + intObj.equals(100)); // true
		System.out.println("intObj.compareTo(intObj2): " + intObj.compareTo(intObj2)); // -1

		// ===== Optional with empty =====
		Optional<Boolean> optionalBool = Optional.of(Boolean.TRUE);
		System.out.println("Optional Boolean: " + optionalBool.orElse(false)); // true

		// ===== Optional ifPresentOrElse (Java 9+) =====
		Optional<String> optStr = Optional.of("Hello");
		optStr.ifPresentOrElse(
				val -> System.out.println("Value: " + val), // Hello
				() -> System.out.println("No value")
				);

		Optional<String> emptyStr = Optional.empty();
		emptyStr.ifPresentOrElse(
				val -> System.out.println("Value: " + val),
				() -> System.out.println("No value") // No value
				);
	}
}


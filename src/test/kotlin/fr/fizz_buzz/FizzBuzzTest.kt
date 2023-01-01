package fr.fizz_buzz

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

internal class FizzBuzzTest {

    val underTest = FizzBuzz()

    @ParameterizedTest
    @ValueSource(ints = intArrayOf(3, 6, 9, 33))
    fun should_return_Fizz_when_multiple_of_3(value: Int) {
        Assertions.assertEquals("Fizz", underTest.fizzBuzz(value))
    }

    @ParameterizedTest
    @ValueSource(ints = intArrayOf(5, 10, 20, 2365))
    fun should_return_Buzz_when_multiple_of_5(value: Int) {
        Assertions.assertEquals("Buzz", underTest.fizzBuzz(value))
    }

    @ParameterizedTest
    @ValueSource(ints = intArrayOf(15, 30, 60, 7095))
    fun should_return_FizzBuzz_when_multiple_of_5_and_3(value: Int) {
        Assertions.assertEquals("FizzBuzz", underTest.fizzBuzz(value))
    }

    @ParameterizedTest
    @ValueSource(ints = intArrayOf(1, 2, 17, 19))
    fun should_return_value_when_not_multiple_of_5_or_3(value: Int) {
        Assertions.assertEquals("7", underTest.fizzBuzz(value))
    }
}
package org.jetbrains.spek.samples
import org.jetbrains.spek.Spek
import org.jetbrains.spek.dsl.describe
import org.jetbrains.spek.dsl.it
import kotlin.test.assertEquals

class NestedDescribesSpec: Spek({
    describe("a calculator") {
        val calculator = SampleCalculator()
        var result = 0

        describe("addition") {
            beforeEach {
                result = calculator.sum(2, 4);
            }

            it("should return the result of adding the first number to the second number") {
                assertEquals(6, result)
            }
            it("should fail") {
                assertEquals(7, result)
            }
        }

        describe("subtraction") {
            beforeEach {
                result = calculator.subtract(4, 2)
            }

            it("should return the result of subtracting the second number from the first number") {
                assertEquals(2, result)
            }
        }
    }
})

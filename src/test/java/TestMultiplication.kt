import org.junit.Assert
import org.junit.Test

class TestMultiplication {
    @Test
    fun testTimesSimple() {
        val fraction: IFraction? = TestUtils.createFraction(2, 3)
        val result: Unit = fraction.times(NotImplementedFraction(5, 7))
        Assert.assertEquals(10, result.getNumerator())
        Assert.assertEquals(21, result.getDenominator())
    }

    @Test
    fun testTimesNormalisation() {
        val fraction: IFraction? = TestUtils.createFraction(4, 6)
        val result: Unit = fraction.times(NotImplementedFraction(5, 7))
        Assert.assertEquals(10, result.getNumerator())
        Assert.assertEquals(21, result.getDenominator())
    }
}
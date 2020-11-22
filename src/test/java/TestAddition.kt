import org.junit.Assert
import org.junit.Test

class TestAddition {
    @Test
    fun testSimple() {
        val fraction: IFraction? = TestUtils.createFraction(3, 5)
        val result: Unit = fraction.plus(NotImplementedFraction(3, 5))
        Assert.assertEquals(6, result.getNumerator())
        Assert.assertEquals(5, result.getDenominator())
    }

    @Test
    fun testNormalisation() {
        val fraction: IFraction? = TestUtils.createFraction(1, 2)
        val result: Unit = fraction.plus(NotImplementedFraction(1, 2))
        Assert.assertEquals(1, result.getNumerator())
        Assert.assertEquals(1, result.getDenominator())
    }
}
import org.junit.Assert
import org.junit.Test

class TestDivision {
    @Test
    fun testDividedBySimple() {
        val fraction: IFraction? = TestUtils.createFraction(4, 1)
        val result: `fun` = fraction.dividedBy(NotImplementedFraction(3, 1))
        Assert.assertEquals(4, result.getNumerator())
        Assert.assertEquals(3, result.getDenominator())
    }

    @Test
    fun testDividedByNormalisation() {
        val fraction: IFraction? = TestUtils.createFraction(4, 6)
        val result: `fun` = fraction.dividedBy(NotImplementedFraction(7, 5))
        Assert.assertEquals(10, result.getNumerator())
        Assert.assertEquals(21, result.getDenominator())
    }
}
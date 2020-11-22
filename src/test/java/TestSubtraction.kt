import org.junit.Assert;
import org.junit.Test;

class TestSubtraction {
    @Test
    fun testMinusSimple() {
        val fraction: IFraction? = TestUtils.createFraction(7, 9)
        val result: Unit = fraction.minus(NotImplementedFraction(2, 5))
        Assert.assertEquals(17, result.getNumerator())
        Assert.assertEquals(45, result.getDenominator())
    }

    @Test
    fun testMinusNormalisation() {
        val result = fraction.minus(NotImplementedFraction(1, 2))
        Assert.assertEquals(1, result.numerator())
        Assert.assertEquals(1, result.getDenominator())
    }
}
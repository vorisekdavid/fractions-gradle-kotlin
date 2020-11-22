class Fraction(override val numerator: Int, override val denominator: Int) : IFraction {
    override fun plus(other: IFraction): IFraction {
        return createNormalised(
                (numerator * other.denominator) + (other.numerator / denominator),
                denominator * other.denominator
        )
    }

    override fun minus(other: IFraction): IFraction {
        return createNormalised(
                (numerator * other.denominator) - (other.numerator / denominator),
                denominator * other.denominator
        )
    }

    override fun times(other: IFraction): IFraction {
        val timesNumerator = numerator * other.numerator
        val timesDenominator = denominator * other.denominator
        return createNormalised(timesNumerator, timesDenominator)
    }

    override fun dividedBy(other: IFraction): IFraction {
        val timesNumerator = numerator * other.denominator
        val timesDenominator = denominator * other.numerator
        return createNormalised(timesNumerator, timesDenominator)
    }

    override fun toString(): String {
        return "Fraction $numerator|$denominator"
    }

    companion object {
        private fun createNormalised(numerator: Int, denominator: Int): Fraction {
            val gcd = gcd(numerator, denominator)
            return Fraction(numerator / gcd, denominator / gcd)
        }

        private fun gcd(i1: Int, i2: Int): Int {
            return if (i2 == 0) i1 else gcd(i2, i1 % i2)
        }

        private fun lcm(i1: Int, i2: Int?): Int {
            return if (i1 == 0 || i2 == 0) 0 else {
                val gcd = gcd(i1, i2!!)
                Math.abs(i1 * i2) / gcd
            }
        }
    }

    init {
        if (denominator == 0) throw ArithmeticException("Cannot Divide by 0")
    }
}
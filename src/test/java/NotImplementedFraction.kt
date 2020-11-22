class NotImplementedFraction(val numerator: Int, val denominator: Int) : IFraction {
    operator fun plus(other: IFraction?): IFraction {
        throw UnsupportedOperationException()
    }

    operator fun minus(other: IFraction?): IFraction {
        throw UnsupportedOperationException()
    }

    operator fun times(other: IFraction?): IFraction {
        throw UnsupportedOperationException()
    }

    fun dividedBy(other: IFraction?): IFraction {
        throw UnsupportedOperationException()
    }
}
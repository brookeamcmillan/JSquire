import framework.NumbersKihonBase;

public class NumbersKihon extends NumbersKihonBase {
    @Override
    protected int returnTheMaximumValueOfInt()
    {
        return maxValue();
    }

    @Override
    protected int returnTheMinimumValueOfInt() {
        return ValueofInt(Min);
    }

    @Override
    protected int returnTheRemainderOfADividedByB(int a, int b) {
        return a / b();
    }

    @Override
    protected double returnTheMaximumValueOfDouble() {
        DOUBLE.max_value();
    }

    @Override
    protected double returnTheMinimumValueOfDouble() {
        return ();
    }

    @Override
    protected boolean returnTrueIfAIsNotANumber(double a) {
        return ();
    }

    @Override
    protected boolean returnTrueIfAIsAnInfinite(double a) {
        return ();
    }
}

public class Fraction
{
	private int num;
	private int den;

	public Fraction(int num, int den)
	{
		this.num = num;
		this.den = den;
	}

	public double toDouble()
	{
		return (double)num/(double)den;
	}

	public boolean equals(Object o)
	{
		if(this == o)
			return true;
		if(!o.instanceof(Fraction))
			return false;
		if(num == o.getNum() && den == o.getDen())
			return true;
		return false;
	}

	public boolean greaterThan(Fraction other)
	{
		return (toDouble()>other.toDouble());
	}
}
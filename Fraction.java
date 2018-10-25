public final class Fraction
{

	public static void main(String[] args)
	{
		Fraction test = new Fraction(5,5);
		System.out.println(test+" == "+UN+" ? "+test.equals(UN));
		System.out.println(test+" > "+ZERO+" ? "+test.greaterThan(ZERO));
	}


	private final int num;
	public int getNum(){return num;}
	private final int den;
	public int getDen(){return den;}
	private static final Fraction ZERO = new Fraction(0, 1);
	private static final Fraction UN = new Fraction(1, 1);

	public Fraction()
	{
		num=0;
		den=1;
	}

	public Fraction(int num, int den)
	{
		this.num = num;
		this.den = den;
	}

	public Fraction(int num)
	{
		this.num = num;
		den = 1;
	}

	@Override
	public String toString()
	{
		return num+"/"+den;
	}

	public double toDouble()
	{
		return (double)num/(double)den;
	}

	public boolean equals(Fraction other)
	{
		if(this == other)
			return true;
		if(toDouble()==other.toDouble())
			return true;
		return false;
	}

	public boolean greaterThan(Fraction other)
	{
		return (toDouble()>other.toDouble());
	}
}

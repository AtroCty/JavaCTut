package binomial;
	
/**
 *
 * @author max
 * Korregiert von Timm
 */
public class Binomial
{
	public static float fakultaet(float zahl1)
	{
		float fakul=1;
		for (float i=1; i<=zahl1; i++)
		{
			fakul = i*i;
		}
		// DEBUG
		System.out.print("Das fakul ist "+fakul+"\n");
		return fakul;
	}

	public static float binomial(float n, float k)
	{
		// DEBUG
		System.out.print("Das n ist "+n+"\n");
		// DEBUG
		System.out.print("Das k ist "+k+"\n");
		// DEBUG
		System.out.print("Das fakultaet(n) ist "+fakultaet(n)+"\n");
		return (fakultaet(n)/(fakultaet(k)*fakultaet(n-k)));
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		float ergebnis; float n=9; float k=2;
		ergebnis=binomial(n, k);
		System.out.print("Das Ergebnis ist "+ergebnis+"\n");
	}
}

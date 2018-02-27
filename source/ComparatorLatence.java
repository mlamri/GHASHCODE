import java.util.Comparator;

public class ComparatorLatence implements Comparator<Couple> {

	public int compare(Couple l1 , Couple l2)
	{
		return l1.getLatence() - l2.getLatence();
	}
}

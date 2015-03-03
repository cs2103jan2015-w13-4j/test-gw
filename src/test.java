import java.util.Iterator;
import java.util.StringTokenizer;


public class test {
	public static void main(String args[]) {
		String tester="-030315 -1400 -1600 -r -n - ";
		StringTokenizer temp=new StringTokenizer(tester,"-");
		System.out.println(temp.countTokens());
		while (temp.hasMoreTokens()) {
			System.out.println(temp.nextToken());;
		}
	}
}

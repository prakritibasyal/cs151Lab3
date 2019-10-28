import java.lang.reflect.Array;
import java.awt.Rectangle;

public class DumpArray {

	public static void dumpArray(Object objects) {
		for (int i = 0; i < Array.getLength(objects); i++) {
			System.out.println(Array.get(objects, i).toString());
		}
	}

	public static void main(String[] args) {
		Object[] objects = { "Hello", 5, "Hi", 10.0, 5, "World", "" };
		int[] ints = { 1, 2 };
		Object[] example = { new Rectangle(50, 80) };
		dumpArray(objects);
		dumpArray(ints);
		dumpArray(example);
	}

}
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		ArrayList<JUPASStudent> jList = new ArrayList<JUPASStudent>();
		ArrayList<NonJUPASStudent> njList = new ArrayList<NonJUPASStudent>();
		try {
			jList = Tools.readJUPASFile("JUPAS.txt");
		} catch (Exception e) {
			System.out.println("File not found");
		}
		try {
			njList = Tools.readNonJUPASFile("NonJUPAS.txt");
		} catch (Exception e) {
			System.out.println("File not found");
		}
		System.out.println("Original JUPAS Student Array List:");
		for (int i = 0; i < jList.size(); i++) {
			System.out.println(jList.get(i).getName() + " " + jList.get(i).getResult());
		}
		System.out.println("");
		System.out.println("Original Non-JUPAS Student Array List:");
		for (int i = 0; i < njList.size(); i++) {
			System.out.println(njList.get(i).getName() + " " + njList.get(i).getResult());
		}
		System.out.println("");
		System.out.println("Combined Array List:");
		ArrayList<Student> sList = new ArrayList<Student>();
		sList = Tools.combineArrayList(jList, njList);
		for (int i = 0; i < jList.size() + njList.size(); i++)
			System.out.println(sList.get(i).getName() + " " + sList.get(i).getResult());
		System.out.println("");
		System.out.println("Sorted Array List:");
		sList = Tools.sort(sList);
		for (int i = 0; i < jList.size() + njList.size(); i++)
			System.out.println(sList.get(i).getName() + " " + sList.get(i).getResult());
	}
}
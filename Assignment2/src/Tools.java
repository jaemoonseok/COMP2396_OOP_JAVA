import java.io.*;
import java.util.ArrayList;

abstract class Tools {
	static ArrayList<JUPASStudent> readJUPASFile(String f) throws Exception{
		BufferedReader readbuffer = null;
		readbuffer = new BufferedReader(new FileReader(f));
		String strRead;
		ArrayList<JUPASStudent> jList = new ArrayList<JUPASStudent>();
		while ((strRead = readbuffer.readLine()) != null) {
			String splitarray[] = strRead.split("\t");
			String firstentry = splitarray[0];
			String secondentry = splitarray[1];
			jList.add(new JUPASStudent(firstentry, Double.parseDouble(secondentry)));
		}
		readbuffer.close();
		return jList;
	}
	
	static ArrayList<NonJUPASStudent> readNonJUPASFile(String f) throws Exception {
		BufferedReader readbuffer = null;
		readbuffer = new BufferedReader(new FileReader(f));
		String strRead;
		ArrayList<NonJUPASStudent> njList = new ArrayList<NonJUPASStudent>();
		while ((strRead = readbuffer.readLine()) != null) {
			String splitarray[] = strRead.split("\t");
			String firstentry = splitarray[0];
			String secondentry = splitarray[1];
			njList.add(new NonJUPASStudent(firstentry, Double.parseDouble(secondentry)));
		}
		readbuffer.close();
		return njList;
		
	}
	
	static ArrayList<Student> combineArrayList(ArrayList<JUPASStudent> S1,
			ArrayList<NonJUPASStudent> S2) {
		ArrayList<Student> s = new ArrayList<Student>();
		for (JUPASStudent js: S1) {
			s.add(js);	
		}
		for (NonJUPASStudent njs: S2 ) {
			s.add(njs);
		}
		
		return s;
	}
	
	static ArrayList<Student> sort(ArrayList<Student> S){
		for (int i=0; i< S.size(); i++) {
			for (int j = i; j <S.size(); j++) {
				Student s1 = S.get(i);
				Student s2 = S.get(j);
				if (s1.getResult() > s2.getResult()){
					int firstIndex = S.indexOf(s1);
					int secondIndex = S.indexOf(s2);
					S.set(firstIndex, s2);
					S.set(secondIndex, s1);
				}
					
				}
		}
		return S;
	}
}

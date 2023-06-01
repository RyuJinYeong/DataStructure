package list;

public class LinearList {
	private String strArray[];
	private int size;
	public static int MAX = 100;
	
	public LinearList() {
		size = 0;
		strArray = new String[MAX];
	}
		
	public boolean isEmpty() {
		if(size == 0)
			return true;
		return false;
	}
	
	public int length() {
		return size;
	}
	
	public String retrieve(int i) {
		return strArray[i];
	}
	
	public int find(String str){
		for(int i = 0; i < size-1; i++) {
			if(strArray[i] == str)
				return i;
		}
		return 0;
	}

	public void replace(int i, String str) {
		strArray[i] = str;
	}
	
	public void replace(String str1, String str2) {
		for(int i = 0; i < size-1; i++) {
			if(strArray[i] == str1)
				strArray[i] = str2;
		}
	}
	
	public void delete(int i) {
		for(int n = i; n < size-1; n++) {
			strArray[n] = strArray[n + 1];
		}
		size--;
	}
	
	public void delete(String str) {
		for(int i = 0; i < size-1; i++) {
			if(strArray[i] == str)
				delete(i);
		}
	}
	
	public void insert(int i,  String str) {
		size++;
		for(int n = 0; n < size-1-i; n++)
			strArray[size-1-n] = strArray[size-2-n];
		strArray[i] = str;
	}
	
	public void insert(String str) {
		size++;
		strArray[size-1] = str;
	}
	
	public void printArray() {
		for(int i = 0; i < size; i++)
			System.out.print("["+i+"] : "+strArray[i]+"\n");
	}
}

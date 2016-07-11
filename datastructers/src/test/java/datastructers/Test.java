package datastructers;

public class Test {
	public static void main(String[] args) {
		System.out.print("Result: ");
		System.out.println(isPatternmatches("mb_12345_8_LiveA_DataLogix_Mobile_New_20160709.txt"));
	}
	
	  public static boolean isPatternmatches(String s){
          return s.matches("mb_\\d{1,5}_\\d{1,7}_LiveA_DataLogix_Mobile_New_\\d{8}.txt");
         
  }

}

package OOP_141226;

public class Exam_Char2 {

	public static void main(String[] args) {
		String str = "hEllo wOrlD";
		
		int[] arrStr = new int['z'-'a'+1];  //a~z
		int index = 0;
		
		//문자열 길이 구하기
		System.out.println("'"+str+"'의 각 문자 갯수는?");
		
		for (int i = 0; i < arrStr.length; i++) {
			arrStr[i] = 0;
		}		
		
		for (char j = 'a'; j <= 'z'; j++) {
			int count = 0;
			
			for (int i = 0; i < str.length(); i++) {
		
				char ch = str.charAt(i);
				if(ch == j || ch == (j-32)) //소문자 대문자 가 같냐
				{
					count++;
				}	
			}
			arrStr[index] = count;
			index++;
		}
		
		
		for (int i = 0; i < arrStr.length; i++) {
			if(arrStr[i] != 0){
				System.out.println((char)(i+97)+": "+arrStr[i]);
			}
		}
	}
}

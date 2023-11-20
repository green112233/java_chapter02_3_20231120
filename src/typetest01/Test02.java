package typetest01;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "123";
		String str2 = "123.123";//정수추가
					
		int s1 = Integer.parseInt(str1);
		double d1 = Double.parseDouble(str2);
		
		System.out.println(s1);
		System.out.println(d1);
		
		int i1 = 1234;
		
		String str3 = String.valueOf(i1);
		System.out.println(str3);
	}

}


public class Main {
	
//コメント入れました１。	
//コメント入れました2。	

	
	
	
	
	
	public static void main(String[] args){
		
		System.out.println("aaaa");
		/*変数の種類
		 * 
		 */
		//論理値型
		boolean bool = true;// true/false
		System.out.println("boolは" + bool);
		
		//変数
		byte b = 1;           //[ 8bit ]  -2^7  ~  2^7-1 (-128 ~ 127)
		System.out.println("byteは" + b);
		
		short s = 1;          //[ 16bit ] -2^15 ~  2^15-1
		System.out.println("shortは" + s);
		
		int i = 1;            //[ 32bit ] -2^31 ~  2^31-1
		System.out.println("intは" + i);
		
		long l = 1l;          //[ 64bit ] -2^63 ~  2^63-1
		System.out.println("longは" + l);
		
		//小数
		float f = 1.0f;        //IEEE 754 規格の32ビット浮動小数点
		System.out.println("floatは" + f);
		
		double d = 1.0d;       //IEEE 754 規格の64ビット浮動小数点
		System.out.println("doubleは" + d);
		
		//文字型
		char c1 = 'あ';          //Unicodeの一文字
		System.out.println("char1は" + c1);
		
		char c2 = '\u0041';     // Unicodeのマップ番号
		System.out.println("char2は" + c2);
		
		//文字列型
		String str = "The World";  //文字列
		
		System.out.println("strは" + str);
	}

}

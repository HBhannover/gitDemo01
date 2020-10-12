public class Helloworld{

  public String convertUTF8toWindows1252 (String inputTextUTF8){
    final Charset fromCharset = Charset.forName("UTF-8");
    final Charset toCharset = Charset.forName("windows-1252");
    String outputText1252 = new String(inputTextUTF8.getBytes(fromCharset),toCharset);
    return outputText1252;

  public String convert1252toUTF8(String inputText1252){
    final Charset fromCharset = Charset.forName("windows-1252");
    final Charset toCharset = Charset.forName("UTF-8");
    String outputTextUTF8 = String(inputText1252.getBytes(fromCharset),toCharset);
    return outputTextUTF8;
  }

	public static void main (String[] args){
	System.out.println("Hello world!");
	int Sum = Common.Sum(5,7);
	System.out.println("Sum is: "+Sum);
	System.out.println("Müller UTF8 -->1252: "+convertUTF8toWindows1252 ("Müller"));
	System.out.println("Müller 1252 --> UTF8: "+convert1252toUTF8 ("Müller"));
	System.out.println("convertArray: "+Arrays.toString(stringArray));
	}
}

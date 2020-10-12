public class Helloworld{

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
	System.out.println("Müller 1252 --> UTF8: "+convert1252toUTF8 ("Müller"));
	}
}

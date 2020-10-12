public class Common {

  public static int Sum (int a, int b){
    int Sum = a + b;
    return Sum;
  }
  public static String[] convertStringToArray(String stringText, String splitCriteria){
    String[] stringArray = stringText.split(splitCriteria);
    return stringArray;
  }

}

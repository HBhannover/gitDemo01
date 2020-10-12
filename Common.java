public class Common {

  public static int Sum (int a, int b){
    int Sum = a + b;
    return Sum;
  }

  public static String[] convertStringToArray(String stringText, String splitCriteria){
    String[] stringArray = stringText.split(splitCriteria);
    return stringArray;
  }

  public static String getStringBetweenTwoChars(String input, String startChar, String endChar) {
    String restString="";
    try {
      for (int i = 0; i < input.length(); i++) {
        int start = input.indexOf(startChar);
        if (start != -1) {
          int end = input.indexOf(endChar, start + startChar.length());
          if (end != -1) {
            String textBetweenChars = input.substring(start + startChar.length(), end);
            input = input.substring(end + 1);

            String snext = getStringBetweenTwoChars(input, startChar, endChar);
            if (snext != "")
              textBetweenChars = textBetweenChars + "%Space&" + snext;
            restString = restString + textBetweenChars;
            return textBetweenChars;
          }
        }
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
    return "";
  }
}

package edu.buet.cse.mule;

public class StringUtils {
  public static String replaceEncodedSpaceChar(String source) {
    if (source == null) {
      return "";
    }

    return source.replaceAll("%20", " ");
  }
}

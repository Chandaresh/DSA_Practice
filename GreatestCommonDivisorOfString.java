class GreatestCommonDivisorOfString {
   public static String gcdOfStrings(String str1, String str2) {
        String gcd = "";
        String divisorStr = "";
        String dividentStr = "";
        if(str1.length() >= str2.length()) {
            divisorStr = str2;
            dividentStr = str1;
        }else {
            divisorStr = str1;
            dividentStr = str2;
        }
        for(int i = 0; i < divisorStr.length(); i++) {
            String substring = divisorStr.substring(0, divisorStr.length()-i);
            if(dividentStr.replaceAll(substring,"").equals("") && divisorStr.replaceAll(substring,"").equals("")){
                gcd = substring;
                break;
            }
        }
        return gcd;
    }
}
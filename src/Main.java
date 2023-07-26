public class Main {
    public static void main(String[] args) {
        System.out.println("--------isPalindrome--------");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("--------isPerfectNumber--------");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("--------numberToWords--------");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int num)  {
        num = Math.abs(num);
        int firstNum = num;
        int reverseNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num = num / 10;
        }
        return (firstNum == reverseNum);
    }
//    public static boolean isPalindrome(int num){
//        num = Math.abs(num);
//        char[] digits = String.valueOf(num).toCharArray();
//        String reversed = "";
//
//        for(int i = digits.length-1; i >= 0; i--){
//            reversed += digits[i];
//        }
//        return Integer.parseInt(reversed) == num;
//    }

    public static boolean isPerfectNumber(int number){
        if(number <= 0) return false;
        int total = 0;
        for(int i = 1; i <= number/2 ; i++){
            if(number % i == 0){
                total += i;
            }
        }
        return number == total;
    }

    public static String numberToWords(int num){
        if(num < 0) return "Invalid Value";

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String numStr = String.valueOf(num);
        StringBuilder result = new StringBuilder();

        for(char digitChar : numStr.toCharArray()){
            int digit = Character.getNumericValue(digitChar);
            result.append(words[digit]).append(" ");
        }
        return result.toString().trim();
    }

    // 2.yöntem
//    public static String numberToWords(int num){
//        if(num < 0) return "Invalid Value";
//        String text = "";
//        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
//        String numStr = String.valueOf(num);
//        char[] digits = numStr.toCharArray();
//
//
//        for(char digit: digits){
//            int index = numStr.indexOf(digit);
//            text += words[index];
//        }
//        return text.trim();
//    }

    // 3. yöntem
//    public static String numberToWords(int num){
//        if(num < 0) return "Invalid Value";
//        String text = "";
//        char[] numArray =  String.valueOf(num).toCharArray();
//        for(char digit : numArray){
//            switch (digit){
//                case '0':
//                    text += "Zero";
//                    break;
//            }
//        }
//      return text.trim();
//    }

}
// 2. Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)


import java.util.HashMap;
import java.util.Scanner;

class RomanToInt{
    public static int romanToInt(String s){
        s = s.toUpperCase();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res = 0;
        int prevValue=0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = map.get(s.charAt(i));

            if (currentValue >= prevValue) {
                res += currentValue;
            } else {
                res -= currentValue;
            }

            prevValue = currentValue;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = romanToInt(s);
        System.out.println(res);
        sc.close();
    }
}

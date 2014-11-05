public class MethodCalls {
    
    public static int addDigit(int x, int y) {
        int answer;
        String original = "" + x;
        int l = original.length();
        int a = (int) Math.pow(10,l);
        if (y >= 0 && y <= 9) {
            int digit1 = y*a;
            answer = digit1+x;
            return answer;
        } else {
            answer = x;
            return answer;
        }
    }
    
    public static void main(String[] arg) {
        int a = 784, b = 22, c;
        c = addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c = addDigit(addDigit(c,4), 5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        /*System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c = join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));*/
    }
}
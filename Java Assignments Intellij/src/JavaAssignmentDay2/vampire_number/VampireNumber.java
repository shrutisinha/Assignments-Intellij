package JavaAssignmentDay2.vampire_number;
/*A vampire number v is a number with an even number of digits n, 
 * that can be factored into two numbers x and y each with n/2 digits 
 * and not both with trailing zeroes, where v contains precisely all the 
 * digits from x and from y, in any order. Write a java program to print 
 * first 100 vampire numbers.
 */

import java.util.*;
import java.lang.*;

public class VampireNumber {
    public static void main(String[] args) {
        ArrayList<Integer> vamp = new ArrayList<>();
        int n = 2;
        VampireNumberClass obj = new VampireNumberClass();
        while (obj.getCount() < 100) {
            obj.generate(vamp, n);
            n += 2;
        }
        while (vamp.size() > 100)
            vamp.remove(100);
        System.out.println("The list of first " + vamp.size() + " vampire numbers are:");
        System.out.println(vamp);
        //System.out.println(vamp.size());
    }
}

class VampireNumberClass {
    private int count = 0;

    public boolean sameChars(String a, String b) {
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }

    public void generate(ArrayList<Integer> vamp, int n) {
        int start = (int) Math.pow(10, n / 2 - 1);
        for (int i = start; i < start * 10; i++) {
            for (int j = i; j < start * 10; j++) {
                int num = i * j;
                String a = String.valueOf(num);
                String b = String.valueOf(i) + String.valueOf(j);
                if (sameChars(a, b)) {
                    count++;
                    vamp.add(num);
                    // Collections.sort(vamp);
                    //System.out.println(i+" * "+j+" = "+num+"  and count is "+count);
                }
            }
        }
        Collections.sort(vamp);
    }

    int getCount() {
        return (count);
    }

}


package com.test.qa;

import static java.lang.Math.*;

public class Test {

        public static int nearestSq(final int n) {
            int res = n;
            // O(n-m) -> m
            for (int i = 0; i < n; i++) { //n=9 i=0
                System.out.println(n - i);
                if (sqrt(n-i) % 1 == 0 ) {
                    res = n- i;
                    break;
                }
                if( sqrt(n+i) % 1 == 0) {
                    res = n + i;
                    break;
                }
            }
//            System.out.println(res);
            return res;
//            return (int) Math.pow(Math.round(sqrt(n)), 2); //O(1)

        }
        @org.testng.annotations.Test
        public void abc() {
            System.out.println(nearestSq(9));
        }
}

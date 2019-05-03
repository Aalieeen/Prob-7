package com.company;
public class Main {

    public static void main(String[] args) {
                int s = 2;
                for ( int w1 = 0; w1 < 10001; s++ ) {
                    if ( bool(s) )
                        w1 ++;}
                System.out.println("число : " + (s-1));}


            static boolean bool ( int w3 ) {
                boolean w2 = true;
                for (int i = 2; i < w3; i++) {
                    if ( w3 % i == 0 ) {
                        w2 = false;
                        break;
                    }
                }
                return w2;
            }
        }



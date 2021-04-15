package com.tts;

public class AsciiChars{

            public static void printNumbers()
            {
                System.out.print("\nThe valid numbers are: ");
                for(int i=0; i<10; i++)
                System.out.print(i+"");
            }

            public static void printLowerCaseLetters()
            {
                System.out.print("\nThe valid lowercase alphabets are: ");
                for(char ch='a';ch<='z';ch++)
                    System.out.print(ch + " ");
            }

            public static void printUpperCaseLetters()
            {
                System.out.print("\nThe valid uppercase alphabets are: ");
                for(char ch='A';ch<='Z';ch++)
                        System.out.print(ch + " ");
            }

    }

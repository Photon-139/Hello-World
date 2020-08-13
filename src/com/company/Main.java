package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        String x="Hello",y="World";
        System.out.println(x+" "+y);

        System.out.printf("%s %s\n","Hello","World");

        System.out.printf("%s %s\n",x,y);

        String[] a={"H","e","l","l","o"," ","W","o","r","l","d"};
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
            if(i==a.length-1){
                System.out.println();
            }
        }
        String z = x+" "+y;
        for(int i=0; i<z.length(); i++){
            System.out.println(z.charAt(i));
        }
    }
}

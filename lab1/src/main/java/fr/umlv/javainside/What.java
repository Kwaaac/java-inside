package fr.umlv.javainside;

public interface What {
       static String what(Object o) {
         return switch(o) {
             case String s -> "String " + s;
             case Integer i -> "Integer " + i;
             default -> throw new AssertionError("unknown type");
         };
       }

       static void main(String[] args) {
         System.out.println(what("hello"));
         System.out.println(what(3));
       }
     }
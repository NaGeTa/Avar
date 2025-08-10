package com.nageta.Avar;

import com.nageta.Avar.processor.Lexer;

public class Test {
    public static void main(String[] args) {
        String code = "var = 1 + 4;";
        Lexer lexer = new Lexer(code);
        System.out.println(lexer.analys());
    }
}

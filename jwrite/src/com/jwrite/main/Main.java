package com.jwrite.main;

import com.jwrite.tools.StringToChars;

public class Main {
    public static void main(String[] args) {
        StringToChars stringToChars = new StringToChars();
        char[] chars = stringToChars.returnChars();
        stringToChars.print(chars);
    }
}

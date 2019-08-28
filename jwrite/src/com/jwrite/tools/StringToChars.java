package com.jwrite.tools;

import java.util.ArrayList;
import java.util.List;

public class StringToChars {
    private static final Integer DELAY = 250;

    Integer line = 1;
    IOTools ioTools = new IOTools();
    GetUserInput getUserInput = new GetUserInput();

    public char[] returnChars(){
        return getUserInput.userInput.toCharArray();
    }

    public void print(char userInput[]){
        List scripts = new ArrayList();
        for (int i=0;i<userInput.length;i++){
            if(userInput[i] == '('){
                Character temp = Character.toUpperCase(userInput[i+1]);
                Character temp2 = Character.toUpperCase(userInput[i+2]);
                scripts.add("KeyPress \"" + temp +"\", 1");
                scripts.add("KeyPress \"" + temp +"\", 1");
                System.out.println("KeyPress \"" + temp +"\", 1");
                System.out.println("KeyPress \"" + temp2 +"\", 1");
                System.out.println("Delay " + DELAY);
                i += 2;
            }else if(userInput[i] == ')'){
                continue;
            }else if(userInput[i] == '-'){
                scripts.add("Delay " + DELAY);
                System.out.println("Delay " + DELAY);
            }else if(userInput[i] == '$'){
                scripts.add("Delay " + DELAY/2);
                System.out.println("Delay " + DELAY/2);
            }else if(userInput[i] == '/'){
                scripts.add("//" + line++);
                System.out.println("//" + line++);

            }else{
                Character temp = Character.toUpperCase(userInput[i]);
                System.out.println("KeyPress \"" + temp +"\", 1");
                System.out.println("Delay " +DELAY);
                scripts.add("KeyPress \"" + temp +"\", 1");
                scripts.add("Delay " +DELAY);
            }

        }
        ioTools.inputScript(scripts);

    }

}



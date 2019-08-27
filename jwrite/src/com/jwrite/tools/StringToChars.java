package com.jwrite.tools;

public class StringToChars {
    GetUserInput getUserInput = new GetUserInput();
    private static final Integer DELAY = 250;
    Integer line = 1;
    public char[] returnChars(){
        return getUserInput.userInput.toCharArray();
    }

    public void print(char userInput[]){
        for (int i=0;i<userInput.length;i++){
            if(userInput[i] == '('){
                Character temp = Character.toUpperCase(userInput[i+1]);
                Character temp2 = Character.toUpperCase(userInput[i+2]);
                System.out.println("KeyPress \"" + temp +"\", 1");
                System.out.println("KeyPress \"" + temp2 +"\", 1");
                System.out.println("Delay " + DELAY);
                i += 2;
            }else if(userInput[i] == ')'){
                continue;
            }else if(userInput[i] == '-'){
                System.out.println("Delay " + DELAY);
            }else if(userInput[i] == '$'){
                System.out.println("Delay " + DELAY/2);
            }else if(userInput[i] == '/'){
                System.out.println("//" + line++);

            }else{
                Character temp = Character.toUpperCase(userInput[i]);
                System.out.println("KeyPress \"" + temp +"\", 1");
                System.out.println("Delay " +DELAY);
            }

        }
    }
}



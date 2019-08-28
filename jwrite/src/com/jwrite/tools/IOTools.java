package com.jwrite.tools;

import java.io.*;
import java.util.List;

public class IOTools {
    String fileName = "abdc";
//    FileOutputStream fos = new FileOutputStream("C:\Users\sweet\Desktop");
    File file = new File("D:/按键精灵/按键精灵2014/QMScript",fileName + ".Q");
    public void inputScript(List scripts){
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
            PrintWriter pw = new PrintWriter(osw);
//            pw.println(script);
            for (int i = 0;i < scripts.size();i++){
                pw.println(scripts.get(i));
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

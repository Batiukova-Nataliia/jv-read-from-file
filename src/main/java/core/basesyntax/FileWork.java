package core.basesyntax;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.WeakHashMap;

public class FileWork {
    public String[] readFromFile(String fileName) {
       File file = new File(fileName);
       String[] arrayResult;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder builder = new StringBuilder();
            String value = bufferedReader.readLine();
            if (value == null) {
                return new String[0];
            }
            while (value != null) {
String sentence = value.toLowerCase();
String[] split = sentence.split("\\W+");
for (String words: split) {
    if (words.charAt(0) =='w') {
        builder.append(words).append(" ");
    }
return new String[0];

}
value = bufferedReader.readLine();
            }
            arrayResult = builder.toString().split(" ");
            Arrays.sort(arrayResult);
        }catch (IOException e) {
            throw new RuntimeException("Can't read a file", e);
        }
return arrayResult;
    }
}

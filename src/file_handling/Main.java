package file_handling;

import java.io.*;

public class Main {
    public static void main(String[] args) {

// try (
//         FileWriter fw =new FileWriter("NewFile.txt")
//         ){
//     fw.write("श्रीमद् भागवत गीता के 5 श्लोक, जो देते हैं जीवन को सही दिशा");
//
// } catch (IOException e) {
//     throw new RuntimeException(e);
// }
        try (
                BufferedReader br = new BufferedReader(new FileReader("NewFile.txt"))){
            System.out.println(br.readLine());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

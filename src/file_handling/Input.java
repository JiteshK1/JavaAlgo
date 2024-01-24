package file_handling;

import java.io.*;

public class Input {
    public static void main(String[] args){

//        try(InputStreamReader isr = new InputStreamReader(System.in)) {
//            System.out.println("Enter the letters");
//            int letter = isr.read();
//            while (isr.ready()){
//                System.out.println((char) letter);
//                letter=isr.read();
//
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        try(
//                FileReader fr = new FileReader("C:\\Users\\kanya\\IdeaProjects\\JavaAlgo\\src\\file_handling\\note.txt")
//                ){
//
//            int letters = fr.read();
//
//            while (fr.ready()){
//                System.out.println((char) letters);
//                letters=fr.read();
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(
//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
//                ){
//
//            System.out.println("Enter the sentence: ");
//            String sentence = br.readLine();
//            System.out.println(sentence);
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try(
                OutputStreamWriter osr = new OutputStreamWriter(System.out)

                ){
            osr.write("Pandu");
            osr.write(10);
            osr.write(1413);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

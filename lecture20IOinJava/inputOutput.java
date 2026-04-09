package lecture20IOinJava;

import  java.io.IOException;
// System ek class hai jo ki java.lang package ke ander aata hai aur java by default internally isko import kar deta hai
public class inputOutput {
    public static void main(String[] args) throws  IOException {
        System.out.println("Hello  World"); // yaha System ek class hai aur uske ander out  static ek referance variable hai  PrintStream naam ki  aur println () ek function hai  jo ki System class mai hai


        // => In Simple words System ek classs hai jiske ander PrintStream class jo  ki final aur static hai ka object hai woh hai -> out aur PrintStream class ke ander println() name ka method hota haoga 
    }
}


// For input from user => System class ke ander ek out ke tereh ek object ref hota hai jo hai  in jo ki InputStream class ke ander hota hai
// java ke ander Stream hota hai jise hum hum floe of data keh sakteh hai aur ishke ander 2 types hote hai
// 1. InputStream and OutputStream in InputStream data flow INTO the program nad in Output stream data flow outside the stream and Both stream are Abstract  classes


// Hymnw ye padha q ki java ka I/O hai woh stream based hai ,  aur Stream ke wajah se java multiple jageh se data to access ya read kar sakta hai
// java mai data stream mai flow karta hai mean all of them are bytes  of stream matlab data bytes mai flow ho rha hai

// Hirarchey of Input and Output Stream

// InputStream (Abstract class) Subclassess => 1. FiileInputStream 2. ByteArrayInputStream 3. BufferedInputStream 4.DataInnputStream 
// =>aur input stream hume batai hai ki hame data toh read kaise karna hai

// OutputStream (Abstract class) Subclassess =>  1. FileOutputStream 2. ByteArrayOutputStream 3. BufferedOutputStream   4. PrintStream

// Reader (Abstract) class which has 1. Buffer Reader 2. InputStreamReader 3. FileReader
// Reader class read  karta hai stream of character ko na ki bytes ko  toh hame character ko type cast karne ki jarurat nhi hai

// Buffer Reader =>1. Read  chunks of characters from OS buffer. 2.Store it in Memory    3, Give them to program when required

//  but Buffer Reader also have limitation so werr comes with Scanner class to solve this problems
/* Scanner works on Tokenization so when we give input as string it break into tokens and Scanner class is Slower than Buffer Reader */
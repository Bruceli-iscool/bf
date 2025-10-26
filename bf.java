import java.util.*;
// brainf**k interpreter written in java
public class bf {
    public static void main(String args[]) {

    }
    public static void interpret(char[] tokens) throws ArrayIndexOutOfBoundsException {
        byte[] cells = new byte[30000];
        // index of the pointer
        int ptr = 0;
        for (char i:tokens) {
            if (i=='>') {
                ptr += 1;
            } else if (i=='<'&&ptr>0) {
                ptr -=1;
            } else if (i=='+') {
                cells[ptr]+=1;
            } else if (i=='-') {
                cells[ptr]-=1;
            } 
            // todo
        }
    }
}
package day03;

import java.util.Arrays;
import java.util.Locale;

public class Caesar extends Encryption {
    private int offset;

    public Caesar(int offset) {
        this.offset = offset; // nem kell szuperhívás, mert default construktor
    }

    @Override
    public String encrypts(String input) {
        char[] output = input.toUpperCase().toCharArray();

        for (int i = 0; i<output.length; i++){
            output[i] += offset;
            if (output[i]> 'Z'){
                output[i]-= 'Z' - 'A' +1;
            }
        }
//        return Arrays.toString(output);
        return new String(output);
    }
}

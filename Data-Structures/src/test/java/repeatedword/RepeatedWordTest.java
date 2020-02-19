package repeatedword;


import RepeatedWord.RepeatedWord;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {
    RepeatedWord test;

    @Before
    public void setUp() throws Exception {
        test = new RepeatedWord();
    }

    @Test
    public void mostFrequentWord() {
//        System.out.println("test = " +  test.mostFrequentWord("Once upon a time, there was a brave princess who..."));
test.mostFrequentWord("Once upon a time, there was a brave princess who...");
//        assertTrue(true);

//        System.out.println(test.mostFrequentWord("It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York..."));
    }
}
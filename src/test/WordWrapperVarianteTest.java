package test;

import main.WordWrapperVariante;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordWrapperVarianteTest {

    /*
    Casos:
       ("", 3) -> ""
       (null, 2) -> ""
       ("hola", 5) -> "hola"
       ("hola", 2) -> "ho--la"
       ("hola buenas", 5) -> "hola--buenas"
       ("abc def ghi", 3) -> "abc--def--ghi"
       ("ohlala", 2) -> "oh--la--la"
     */

    WordWrapperVariante wordWrapperVariante;

    @Before
    public void instanciate(){
        wordWrapperVariante = new WordWrapperVariante();
    }

    @Test
    public void testing_wordWrapper(){
        Assert.assertEquals("", wordWrapperVariante.wrap("", 3));
        Assert.assertEquals("", wordWrapperVariante.wrap(null, 3));
        Assert.assertEquals("hola", wordWrapperVariante.wrap("hola", 5));
        Assert.assertEquals("ho\nla", wordWrapperVariante.wrap("hola", 2));
        Assert.assertEquals("hola\nmundo", wordWrapperVariante.wrap("hola mundo", 7));
    }
}

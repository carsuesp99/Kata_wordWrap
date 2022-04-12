package test;

import main.WordWrapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class wordWrapperTest {


    private WordWrapper wordWrapper;

    @Before
    public void intialize() {
        wordWrapper = new WordWrapper();
    }

    @Test
    public void replace_only_spaces_matching_the_wrap_index(){
        Assert.assertEquals(" \ndef", wordWrapper.wrap("  def", 3));
        Assert.assertEquals("abc\n\ndef", wordWrapper.wrap("abc  def", 3));
    }

    @Test
    public void empty_or_small_text_does_not_need_to_be_wrapped(){
        Assert.assertEquals("", wordWrapper.wrap("", 2));
        Assert.assertEquals("hola", wordWrapper.wrap("hola", 5));
    }

    @Test
    public void words_are_wrapped_when_dont_fit_the_column_width(){
        Assert.assertEquals("long\nword", wordWrapper.wrap("longword", 4));
        Assert.assertEquals("areall\nylongw\nord", wordWrapper.wrap("areallylongword", 6));
    }

    @Test
    public void wrap_through_spaces(){
        Assert.assertEquals("abc\ndef\nghi", wordWrapper.wrap("abc def ghi", 3));
        Assert.assertEquals("a\nlongword", wordWrapper.wrap("a longword", 8));
        Assert.assertEquals("abc\ndef", wordWrapper.wrap("abc def", 3));
        Assert.assertEquals("\ndef", wordWrapper.wrap(" def", 3));
        Assert.assertEquals("d\nef", wordWrapper.wrap("d ef", 3));
    }

}

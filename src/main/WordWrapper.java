package main;

public class WordWrapper {
    public String wrap(String text, int nColumns){
        if (text.length() <= nColumns) {
            return text;
        }

        int indexOfSpace = text.lastIndexOf(" ");
        boolean shallWrapUsingSpace = indexOfSpace > -1 && indexOfSpace < nColumns;
        int wrapIndex = (shallWrapUsingSpace ? indexOfSpace : nColumns);

        String wrappedText = text.substring(0, wrapIndex).concat("\n");
        String unwrappedText = text.substring(wrapIndex).replaceFirst(" ","");

        return wrappedText.concat(wrap(unwrappedText, nColumns));
    }
}

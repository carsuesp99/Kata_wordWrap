package main;

public class WordWrapperVariante {

    public String wrap(String text, int columnsWidth){
        if(text == null || text == ""){
            return "";
        }
        if(text.length() > columnsWidth){
            int wrapIndex = text.lastIndexOf(" ");
            if(wrapIndex != -1){
                return text.substring(0, wrapIndex).concat("\n").concat(text.substring(wrapIndex + 1));
            }
            return text.substring(0, columnsWidth).concat("\n").concat(text.substring(columnsWidth));
        }
        return text;
    }
}

package com.string;

public class CompareString {

    public CompareString() {

    }

    public boolean compareIgnoreCase(String string1, String string2){
        if(string1.equalsIgnoreCase(string2)) {
            return true;
        }
        else {
            return false;
        }
    }

}

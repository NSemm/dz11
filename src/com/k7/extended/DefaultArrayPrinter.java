package com.k7.extended;

import com.k7.ArrayPrinter;

public class DefaultArrayPrinter extends ArrayPrinter {
    @Override
    protected String printElem(int elem) {
        String out = "" + elem + "";
        return out;
    }

}

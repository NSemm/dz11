package com.k7.extended;

import com.k7.ArrayPrinter;

public class SpecialArrayPrinter extends ArrayPrinter {
    @Override
    protected String printElem(int elem) {
        String out = "<<" + elem + ">>";
        return out;
    }
}

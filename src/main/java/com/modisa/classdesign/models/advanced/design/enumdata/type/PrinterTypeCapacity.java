package com.modisa.classdesign.models.advanced.design.enumdata.type;

public enum PrinterTypeCapacity {
    DOTMATRIX(5), INKJET(10), LASER(50);

    private int pagePrintCapacity;

    private PrinterTypeCapacity(int pagePrintCapacity) {
        this.pagePrintCapacity = pagePrintCapacity;
    }

    public int getPagePrintCapacity() {
        return pagePrintCapacity;
    }
}

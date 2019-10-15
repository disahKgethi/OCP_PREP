package com.modisa.classdesign.models.advanced.design.enumdata.type;

public class EnumTest {
    PrinterType printerType;
    PrinterTypeCapacity printerTypeCapacity;

    public EnumTest(PrinterType printerType) {
        this.printerType = printerType;
    }

    public EnumTest(PrinterTypeCapacity printerTypeCapacity) {
        this.printerTypeCapacity = printerTypeCapacity;
    }

    public void testCapacit() {
        switch (printerTypeCapacity) {
            case LASER:
                System.out.println("Laser provides best quality 😄");
                break;
            case INKJET:
                System.out.println("Inkjet provides decent quality 😊");
                break;
            case DOTMATRIX:
                System.out.println("DOTMATRIX printers are economical 👏");
                break;
            default:
                System.out.println("🤙😄😊😒");
        }
        System.out.println("Print page capacity per minute: " + printerTypeCapacity.getPagePrintCapacity());
    }

    public void feature() {
        switch (printerType) {
            case DOTMATRIX:
                System.out.println("Dot-Matrix printers are ayoba!!!");
                break;
            case INKJET:
                System.out.println("When it come to decent quality...this are the best");
            case LASER:
                System.out.println("But this ones provides best quality prints");
            default:
                System.out.println("3D printer are modern");
        }
    }
}

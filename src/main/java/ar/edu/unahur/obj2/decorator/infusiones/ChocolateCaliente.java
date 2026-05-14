package ar.edu.unahur.obj2.decorator.infusiones;

public class ChocolateCaliente implements IInfusion {

    @Override
    public String getNombre() {
        return "Chocolate caliente";
    }

    @Override
    public Double getCostoBase() {
        return 4.00;
    }

}

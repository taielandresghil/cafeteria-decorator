package ar.edu.unahur.obj2.decorator.infusiones;

public class Cafe implements IInfusion {

    @Override
    public String getNombre() {
        return "Cafe";
    }

    @Override
    public Double getCostoBase() {
        return 3.00;
    }

    
    
}

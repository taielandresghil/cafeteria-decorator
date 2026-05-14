package ar.edu.unahur.obj2.decorator.infusiones;

public class Te implements IInfusion {

    @Override
    public String getNombre() {
        return "Te";
    }

    @Override
    public Double getCostoBase() {
        return 2.00;
    }

}

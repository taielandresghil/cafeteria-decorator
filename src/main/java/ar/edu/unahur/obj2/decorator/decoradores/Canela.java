package ar.edu.unahur.obj2.decorator.decoradores;

import ar.edu.unahur.obj2.decorator.infusiones.IInfusion;

public class Canela extends IngredienteDecorator {

    public Canela(IInfusion infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
        return 0.5;
    }

    @Override
    protected String getNombreExtra() {
        return "Canela";
    }
    
}

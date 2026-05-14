package ar.edu.unahur.obj2.decorator.decoradores;

import ar.edu.unahur.obj2.decorator.infusiones.IInfusion;

public class Crema extends IngredienteDecorator {
    
    public Crema(IInfusion infusion) {
        super(infusion);
    }
    
    @Override
    protected Double getCostoExtra() {
        return 2.00;
    }

    @Override
    protected String getNombreExtra() {
        return "Crema";
    }
}

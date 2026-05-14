package ar.edu.unahur.obj2.decorator.decoradores;

import ar.edu.unahur.obj2.decorator.infusiones.IInfusion;


public class Leche extends IngredienteDecorator {

    public Leche(IInfusion infusion) {
        super(infusion);
    }
    
    @Override
    protected Double getCostoExtra() {
        return 1.00;
    }

    @Override
    protected String getNombreExtra() {
        return "Leche";
    }

}

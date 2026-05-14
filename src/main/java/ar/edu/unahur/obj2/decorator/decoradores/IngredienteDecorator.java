package ar.edu.unahur.obj2.decorator.decoradores;

import ar.edu.unahur.obj2.decorator.infusiones.*;
import ar.edu.unahur.obj2.decorator.exepciones.*;

//Siempre debe implementar el tipo de elementos que vas a decorar
public abstract class IngredienteDecorator implements IInfusion {
    //La clase decoradorar debe saber a quien esta decorando
    private final IInfusion infusion;

    //Ahora creamos el construstor para poder tomar el elemento a decorar
    protected IngredienteDecorator(IInfusion infusion) {
        if (infusion == null) {
            throw new InfusionNulaException();
        } 
        this.infusion = infusion;    
    }

    @Override
    public String getNombre() {
        return infusion.getNombre() + " " + "con" + " " + this.getNombreExtra(); 
    }
    
    @Override
    public Double getCostoBase() {
        return infusion.getCostoBase() + this.getCostoExtra(); 
    }

    protected abstract Double getCostoExtra();

    protected abstract String getNombreExtra();


}

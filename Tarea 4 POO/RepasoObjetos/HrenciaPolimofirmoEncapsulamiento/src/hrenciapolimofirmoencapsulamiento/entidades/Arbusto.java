package hrenciapolimofirmoencapsulamiento.entidades;

public class Arbusto extends Planta{
    private double anchoArbusto;
    private boolean domestico;
    private String variedadArbusto;
    private String colorHojas;
    private boolean sePoda;

    public Arbusto() {
    }

    public Arbusto(double anchoArbusto, boolean domestico, String variedadArbusto, String colorHojas, boolean sePoda, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.domestico = domestico;
        this.variedadArbusto = variedadArbusto;
        this.colorHojas = colorHojas;
        this.sePoda = sePoda;
    }

    public double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isSePoda() {
        return sePoda;
    }

    public void setSePoda(boolean sePoda) {
        this.sePoda = sePoda;
    }

    @Override
    public String toString() {
        return "\n-Ancho Arbusto: " + anchoArbusto + "\n-Domestico?: " + domestico + "\n-Variedad Arbusto: " + variedadArbusto + "\n-Color Hojas: " + colorHojas + "\n-Se Poda?: " + sePoda;
    }    
}

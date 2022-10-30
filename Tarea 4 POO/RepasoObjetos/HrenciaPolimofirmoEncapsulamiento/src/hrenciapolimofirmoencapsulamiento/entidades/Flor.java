package hrenciapolimofirmoencapsulamiento.entidades;

public class Flor extends Planta{
    private String colorPetalo;
    private int cantPetalo;
    private String colorPistillo;
    private String variedadFlor;
    private String estacionFlorece;

    public Flor() {
    }

    public Flor(String colorPetalo, int cantPetalo, String colorPistillo, String variedadFlor, String estacionFlorece, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalo = colorPetalo;
        this.cantPetalo = cantPetalo;
        this.colorPistillo = colorPistillo;
        this.variedadFlor = variedadFlor;
        this.estacionFlorece = estacionFlorece;
    }

    public String getColorPetalo() {
        return colorPetalo;
    }

    public void setColorPetalo(String colorPetalo) {
        this.colorPetalo = colorPetalo;
    }

    public int getCantPetalo() {
        return cantPetalo;
    }

    public void setCantPetalo(int cantPetalo) {
        this.cantPetalo = cantPetalo;
    }

    public String getColorPistillo() {
        return colorPistillo;
    }

    public void setColorPistillo(String colorPistillo) {
        this.colorPistillo = colorPistillo;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacionFlorece() {
        return estacionFlorece;
    }

    public void setEstacionFlorece(String estacionFlorece) {
        this.estacionFlorece = estacionFlorece;
    }

    @Override
    public String toString() {
        return "\n-Color Petalo: " + colorPetalo + "\n-Cant Petalos: " + cantPetalo + "\n-Color Pistillo: " + colorPistillo + "\n-Variedad Flor: " + variedadFlor + "\n-Estacion en la que Florece: " + estacionFlorece;
    }
}

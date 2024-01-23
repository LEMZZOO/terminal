public class Movil {
    private String marcaMovil;
    private int memoriaRAM;
    private Auriculares misAuriculares;

    public Movil(String marcaMovil, int memoriaRAM, Auriculares misAuriculares) {
       this.marcaMovil = marcaMovil;
       this.memoriaRAM = 16;
       this.misAuriculares = misAuriculares;
    }

    public String getMarcaMovil() {
        return marcaMovil;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public Auriculares getMisAuriculares() {
        return misAuriculares;
    }
}

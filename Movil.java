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
    
    public void setMarcamovil(String marcaMovil){
        this.marcaMovil = marcaMovil;
    }
    
    public void setMarcamovil(int memoriaRAM){
        this.memoriaRAM = memoriaRAM;
    }
    
    public void setMarcamovil(Auriculares misAuriculares){
        this.misAuriculares = misAuriculares;
    }
    
    public void imprimirDetalles(){
        System.out.println("La marca es " + marcaMovil + ", tiene " + memoriaRAM + "GB, los decibelios maximos son " + misAuriculares.getDbMax() + "Cancelación de ruido: " + misAuriculares.getCancelacionDeRuido());
    }
}

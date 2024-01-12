public class Auriculares{
    private int dbMax;
    boolean cancelacionDeRuido;
    
    public Auriculares(){
        dbMax = 0;
        cancelacionDeRuido = false;
    }

    public int getDbMax() {
        return dbMax;
    }

    public void setDbMax(int dbMax) {
        this.dbMax = dbMax;
    }

    public void setCancelacionDeRuido(boolean cancelacionDeRuido) {
        this.cancelacionDeRuido = cancelacionDeRuido;
    }

    public boolean getCancelacionDeRuido(){
        return cancelacionDeRuido;
    }
}


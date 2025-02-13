package maquinaria;

class Vagon {
    private final int ID;
    private double cargaMaxima;
    private double cargaActual;
    private String tipoMercancia;


    public Vagon(int ID, double cargaMaxima, double cargaActual, String tipoMercancia) {
        this(ID, cargaMaxima);
        setCargaActual(cargaActual);
        this.tipoMercancia = tipoMercancia;
    }

    public Vagon(int ID, double cargaMaxima) {
        if(ID < 0) {
            System.out.println("Error: La ID introducida no es valida.");
            this.ID = 0;
        }
        else this.ID = ID;

        setCargaMaxima(cargaMaxima);
    }

    public int getID() {
        return ID;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        if(cargaMaxima < 0.1) {
            System.out.println("Error: La carga máxima debe ser mayor o igual a 0.1 KG");
            this.cargaMaxima = 0.1;
        }
        else this.cargaMaxima = cargaMaxima;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(double cargaActual) {
        if(cargaActual < 0) System.out.println("Error: La carga actual debe ser mayor o igual que 0");
        else if(cargaActual > cargaMaxima) {
            System.out.println("Error: La carga actual no debe superar la carga máxima");
            this.cargaActual = cargaMaxima;
        }
        else this.cargaActual = cargaActual;
    }

    public String getTipoMercancia() {
        return tipoMercancia;
    }

    public void setTipoMercancia(String tipoMercancia) {
        this.tipoMercancia = tipoMercancia;
    }

    @Override
    public boolean equals(Object obj) {
        boolean resultado = false;
        if(((Vagon) obj).getID() == ID) resultado = true;

        return resultado;
    }
}

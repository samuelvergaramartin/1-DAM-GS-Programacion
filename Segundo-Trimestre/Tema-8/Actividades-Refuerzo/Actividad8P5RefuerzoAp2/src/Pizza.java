public class Pizza {
    private String tamanio, estado;
    private TiposPizza tipo;
    public static int totalPizzasPedidas = 0, totalPizzasServidas = 0;


    public Pizza(String tamanio, TiposPizza tipo) {
        setTamanio(tamanio);
        this.estado = "Pedida";
        totalPizzasPedidas++;
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void sirve() {
        if(estado.equals("Servida")) System.out.println("Error: Esa pizza ya se ha servido");
        else {
            estado = "Servida";
            totalPizzasServidas++;
        }
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        if(tamanio.toLowerCase().equals("mediana") || tamanio.toLowerCase().equals("familiar")) {
            this.tamanio = tamanio.toLowerCase();
        }
        else {
            System.out.println("Error: Tamaño no válido. Establecido en mediana, por defecto.");
            this.tamanio = "mediana";
        }
    }

    public void setTipo(TiposPizza tipo) {
        this.tipo = tipo;
    }

    public TiposPizza getTipo() {
        return tipo;
    }
}

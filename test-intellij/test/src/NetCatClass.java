public class NetCatClass {
    private String type;
    private int edad;
    private String owner;

    public NetCatClass (String type, int edad, String owner) {
        this.type = type;
        this.edad = edad;
        this.owner = owner;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return this.owner + "\n" + this.type + "\n" + this.edad;
    }
}

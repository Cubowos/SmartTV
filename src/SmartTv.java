public class SmartTv {
    //atributos
    private String marca;
    private int pulgadas;
    private int resolucion;
    private int precio;

    //constructors
    public SmartTv(){

    }
    public SmartTv(String marca, int pulgadas, int resolucion, int precio) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
        this.precio = precio;
    }
//setters and getters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    //metodos
    public String encendido(){

        return "esta encendida";
    }
    public String apagado(){
        return "esta apagado";
    }
    @Override
    public String toString() {
        return "SmartTv{" +
                "marca='" + marca + '\'' +
                ", pulgadas=" + pulgadas +
                ", resolucion=" + resolucion +
                ", precio=" + precio +
                '}';
    }
}

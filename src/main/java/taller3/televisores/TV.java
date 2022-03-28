package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTV;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        canal = 1;
        volumen = 1;
        precio = 500;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void setCanal(int canal) {
        if ((1 <= canal) && (canal <= 120) && (estado)) {
            this.canal = canal;
        }
    }

    public static void setNumTv(int numtv) {
        NumTV = numtv;
    }
    
    public Marca getMarca() {
        return marca;
    }

    public Control getControl() {
        return control;
    }

    public int getPrecio() {
        return precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public int getCanal() {
        return canal;
    }

    public static int getNumTv() {
        return numTV;
    }

    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public void canalUp() {
        if ((canal < 120) && (estado)) {
            canal++;
        }
    }

    public void canalDown() {
        if ((canal > 2) && (estado)) {
            canal--;
        }
    }

    public void volumenUp() {
        if ((volumen < 7) && (estado)) {
            volumen++;
        }
    }
    public void volumenDown() {
        if ((volumen < 7) && (estado)) {
            volumen--;
        }
    }
}

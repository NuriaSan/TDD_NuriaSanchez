public class Coche {
    public int velocidad;

    public void acelerar_Nuria (int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_Nuria (int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad < 0) velocidad = 0;
    }
}

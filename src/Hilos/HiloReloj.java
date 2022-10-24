package Hilos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class HiloReloj implements Runnable{

    private Thread hilo;
    private String hora;
    private TimeZone zona;
    private SimpleDateFormat sdf;

    public HiloReloj(ThreadGroup tg, String nombre, int prioridad, String ciudad) {
        hilo = new Thread(tg,this, nombre);
        hilo.setPriority(prioridad);

        zona = TimeZone.getTimeZone(ciudad);

        sdf = new SimpleDateFormat("HH:mm:ss:SSS");
        sdf.setTimeZone(zona);


        hora = "";
    }

    public Thread getHilo() {
        return hilo;
    }

    public void setHilo(Thread hilo) {
        this.hilo = hilo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public TimeZone getZona() {
        return zona;
    }

    public void setZona(TimeZone zona) {
        this.zona = zona;
    }

    @Override
    public void run() {
        while(true){
            try {
            actualizarHora();
            mostrarHora();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private void mostrarHora() {
        System.out.println(hora);
    }


    //Metodo para obtener la HORA
    private void actualizarHora() {
        Calendar calendar = Calendar.getInstance();
        hora = sdf.format(calendar.getTime());
    }
}

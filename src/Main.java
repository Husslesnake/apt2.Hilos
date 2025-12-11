import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Semaphore;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Completar Codigo
        //Creamos array de pasajeros para el barco
        ArrayList pasajeros = new ArrayList();

        //creamos las balsas
        Balsa Acasta = new Balsa("Acasta",1,0.5);
        Balsa Banff     = new Balsa("Banff",2,1);
        Balsa Cadiz     = new Balsa("Cadiz",3,2);
        Balsa Deimos     = new Balsa("Deimos",4,4);
        Balsa Expedicion     = new Balsa("Expedicion",5,8);

        //Bucle para crear los 352 pasajeros de forma aleatoria
        for (int i = 0; i < 352; i++) {
            pasajeros.add(new Pasajero(i, (int) (Math.random()*4)+1));
        }



        //Construimos barco con el array pasajeros
        Barco barco = new Barco(pasajeros);


        //Crear semaforo
        Semaphore semaphore=new Semaphore(1);

        //Crear rescates
        Rescate rescate1= new Rescate(Acasta,barco,semaphore);
        Rescate rescate2= new Rescate(Banff,barco,semaphore);
        Rescate rescate3= new Rescate(Cadiz,barco,semaphore);
        Rescate rescate4= new Rescate(Deimos,barco,semaphore);
        Rescate rescate5= new Rescate(Expedicion,barco,semaphore);


        //Crear el hilo de rescates
        Thread hiloAcasta = new Thread(rescate1);
        Thread hiloBanff = new Thread(rescate2);
        Thread hiloCadiz = new Thread(rescate3);
        Thread hiloDeimos = new Thread(rescate4);
        Thread hiloExpedicion = new Thread(rescate5);



        hiloAcasta.start();
        hiloBanff.start();
        hiloCadiz.start();
        hiloDeimos.start();
        hiloExpedicion.start();


        //rescate1.run();
        //rescate2.run();






    }
}
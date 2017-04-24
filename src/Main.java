import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Persona jugador1 = new Persona();
        jugador1.setNombre("Luis");
        jugador1.setApellido("Arancibia");
        jugador1.setDni(19883844);


        Persona jugador2 = new Persona();
        jugador2.setNombre("Cristian");
        jugador2.setApellido("Berzer");
        jugador2.setDni(19883454);
        int opcionSeleccionada;
        boolean terminar=false;
        while(terminar!=true){

            System.out.println("Es el turno de jugador 1 selecciona una accion, "+ jugador1.getNombre());
            System.out.println("1) Golpear");
            System.out.println("2) Aumentar energia");
            System.out.println("3) apreta cualquier otra tecla para terminar");
            opcionSeleccionada= scanner.nextInt();

            if(opcionSeleccionada==1){
                jugador2.recibirDaño();
                System.out.println("El jugador 2 recibio daño y ahora su energia es  "+ jugador2.getEnergia());

            }else if(opcionSeleccionada==2){
                jugador1.aumentarFortaleza();
                System.out.println("El jugador 1 aumento su energia a "+ jugador1.getEnergia());

            }else{
                terminar=true;
                System.out.println("juego terminado");
            };

            System.out.println("Es el turno de jugador 2 selecciona una accion, "+ jugador2.getNombre());
            System.out.println("1) Golpear");
            System.out.println("2) Aumentar energia");
            System.out.println("3) apreta cualquier otra tecla para terminar");
            opcionSeleccionada= scanner.nextInt();

            if(opcionSeleccionada==1){
                jugador1.recibirDaño();
                System.out.println("El jugador 1 recibio daño y ahora su energia es  "+ jugador1.getEnergia());

            }else if(opcionSeleccionada==2){
                jugador2.aumentarFortaleza();
                System.out.println("El jugador 2 aumento su energia a "+ jugador2.getEnergia());

            }else{
                terminar=true;
                System.out.println("juego terminado chauuuuu");
            };

        }


    }
}

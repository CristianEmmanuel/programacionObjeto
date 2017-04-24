/**
 * Created by cristian on 24/04/17.
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private int energia = 100;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getApellido (){
        return this.apellido;
    }

    public void setDni(int dni){
        this.dni = dni;
    }

    public int getDni(){
        return this.dni;
    }

    public void setEnergia(int Energia){
        this.energia = Energia;
    }

    public int getEnergia(){
        return this.energia;
    }

    public void recibirDaño(){
        this.energia=this.energia-10;
    }

    public void aumentarFortaleza(){
        this.energia=this.energia+11;
    }



}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author areamovil
 */
public class Gato {
    private String nombre;
    private String colors;
    private String raza;
    private byte hijos;
    private byte vidas;
    private Date fechaNacimiento;

    public Gato() {
        this.nombre = "Bola de Nieve";
        this.colors = "blanco y negro";
        this.raza = "Balines";
        this.hijos = 1;
        this.vidas = 7;
        this.fechaNacimiento = null;
    }

    public Gato(String nombre, String colors, String raza, byte hijos, byte vidas, Date fechaNacimiento) {
        this.nombre = nombre;
        this.colors = colors;
        this.raza = raza;
        this.hijos = hijos;
        this.vidas = vidas;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Gato(String nombre, String colors, String raza, Date fechaNacimiento) {
        this.nombre = nombre;
        this.colors = colors;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public boolean correr (){
        
        String corriendo = "El Gato esta corriendo";
    
    return correr();
    }
    
    public int saltar (){
        byte saltoGato;
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿El Gatos Cuantas veces salta?");
        saltoGato = entrada.nextByte();
        
     return saltoGato;
    
    }
    
    public void maullar(){
    
        System.out.println("El gato esta maullando");
    
    }
    
    public boolean dormir (){
        Scanner entrada = new Scanner(System.in);
        String durmiendo; 
     boolean dormir = false;
        System.out.println("El gato esta durmirntdo? R//'SI' o 'NO'");
        durmiendo = entrada.next();
        
        if((durmiendo.equals("SI")||(durmiendo.equals("Si")||(durmiendo.equals("si"))))){
        dormir = true;
        
        }else if ((durmiendo.equals("NO")||(durmiendo.equals("No")||(durmiendo.equals("no"))))){
        
            dormir = false;
        
        }
        
        
        return  dormir;

    
    }
    
    public  byte calcularEdadDelGato(){
        byte edadGato = 0;
        
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
        Calendar fechaActual = Calendar.getInstance();
        Calendar fechaNacimiento = Calendar.getInstance();
        
        fechaNacimiento.setTime(this.fechaNacimiento);
        
        byte diaActual;
        byte mesActual;
        byte añoActual;
        
        byte diaNacimiento;
        byte mesNacimiento;
        byte añoNacimiento;
        
        diaActual = (byte) fechaActual.get(Calendar.DAY_OF_MONTH);
        mesActual = (byte) fechaActual.get(Calendar.MONTH);
        añoActual = (byte) fechaActual.get(Calendar.YEAR);
        
        diaNacimiento = (byte)fechaNacimiento.get(Calendar.DAY_OF_MONTH);
        mesNacimiento = (byte)fechaNacimiento.get(Calendar.MONTH);
        añoNacimiento = (byte)fechaNacimiento.get(Calendar.YEAR);
        
        edadGato = (byte)((byte) añoActual - añoNacimiento);
        
        if (mesActual < mesNacimiento ){
            edadGato = (byte) (edadGato - 1);
            
        } else if (mesActual== mesNacimiento){
            if (diaActual< diaNacimiento){
            edadGato --; 
            }
        }
   
        return edadGato;
    
    }
    
    public byte vidasRestantes(byte AcidentesGraves){
        
        byte vidasrestantes = (byte) (AcidentesGraves - this.vidas);
        
        if (vidasrestantes <=0){
            System.out.println("el gato se durmio de por vida.");
        }
 
        return vidasrestantes;
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public byte getHijos() {
        return hijos;
    }

    public void setHijos(byte hijos) {
        this.hijos = hijos;
    }

    public byte getVidas() {
        return vidas;
    }

    public void setVidas(byte vidas) {
        this.vidas = vidas;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
        
        
        
        
    
}

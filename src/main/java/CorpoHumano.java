package main.java;

public class CorpoHumano {

    //Declarando os atributos

    private float massa,volume,densidade,altura,imc;

    //Construtor


    public CorpoHumano(float massa, float volume, float densidade,float altura) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }

    // Getter and Setter
    public float getMassa() {
        return massa;
    }

    public void setMassa(float massa) {
        this.massa = massa;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getDensidade() {
        return densidade;
    }

    public void setDensidade(float densidade) {
        this.densidade = densidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


//Calculando IMC

    public void calcularIMC(){
        this.imc = this.massa/this.altura;
        System.out.println("IMC: "+this.imc);
    }
}
package main.java;

public class CorpoHumano {
    private float massa;
    private float volume;
    private float densidade;
    private float altura;
    // Construtor
    public CorpoHumano(float massa, float volume, float densidade, float altura) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }
    // Getters
    public float getMassa() {
        return massa;
    }
    public float getVolume() {
        return volume;
    }
    public float getDensidade() {
        return densidade;
    }
    public float getAltura() {
        return altura;
    }
    // Setters
    public void setMassa(float massa) {
        this.massa = massa;
    }
    public void setVolume(float volume) {
        this.volume = volume;
    }
    public void setDensidade(float densidade) {
        this.densidade = densidade;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    // Desafio: IMC
    public float calculoIMC() {
        return massa / (altura * altura);
    }
}
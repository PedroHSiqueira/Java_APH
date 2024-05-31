package com.mycompany.encapsulamento;

public class Controle implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public Controle() {
        volume = 50;
    }

    public boolean getLigado() {
        return ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean setLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean setTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Ligado: " + getLigado());
        System.out.println("Volume: " + getVolume());
        System.out.println("Está tocando: " + getTocando());

        for (int i = 0; i < getVolume(); i += 10) {
            System.out.print("|");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }

    @Override
    public void maisVolume() {
        if (getLigado()) {
            setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if (getLigado()) {
            setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if (getLigado() && getVolume() > 0) {
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (getLigado() && getVolume() == 0) {
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if (getLigado() && !getTocando()) {
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (getLigado() && getTocando()) {
            setTocando(false);
        }
    }

}

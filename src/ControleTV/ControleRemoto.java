package ControleTV;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 5;
        this.ligado = true;
        this.tocando =false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean l) {
        this.ligado = l;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean t) {
        this.tocando = t;
    }


    public void ligar() {
        this.setLigado(true);
        System.out.println("TV On!");

    }

    public void desligar() {
        this.setLigado(false);
        System.out.println("TV Off!");
    }


    public void abrirMenu() {
        //System.out.println("Esta ligado? " + this.isLigado());
        //System.out.println("Esta tocando? " + this.isTocando());
        System.out.print("Volume: " + this.getVolume()+ " ");
        /*System.out.println(" ");
        for(int i= 0; i<=this.getVolume(); i+=1){
            System.out.print("0");
        }
        */
        System.out.println(" ");
        }


    public void fecharMenu() {
        System.out.println("Menu fechado");


    }

    @Override
    public void maisVolume() {
        if(this.isLigado()){
            this.setVolume (this.getVolume()+1);
            System.out.println("Volume: "+ this.getVolume());
        }

    }

    @Override
    public void menosVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume()-1);
            System.out.println("Volume: "+ this.getVolume());
        }

    }

    @Override
    public void ligarMudo() {
        if(isTocando() && this.getVolume() > 0){
            this.setVolume(0);
        }
        System.out.println("Mudo");

    }

    @Override
    public void desligarMudo() {
        if(isTocando() && this.getVolume()==0){
            this.setVolume(5);
        }
        System.out.println("Volume: "+ this.getVolume());

    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        }

    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }

    }
}

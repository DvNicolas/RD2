public class Personagem {


    private int vida;
    private int energia;
    private int nivel;


    public Personagem(String vida, int energia, int nivel) {
        this.vida = 100;
        this.energia = 100;
        this.nivel = 1;
    }


    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
public class Main {
    public static void main(String[] args) {
        Personagem p = new Personagem("100", 100, 1);

        IO.println("Vida: " + p.getVida());
        IO.println("Energia: " + p.getEnergia());
        IO.println("Nível: " + p.getNivel());

        p.setVida(80);
        p.setEnergia(70);
        p.setNivel(2);

        IO.println("--- Depois de alterar ---");
        IO.println("Vida: " + p.getVida());
        IO.println("Energia: " + p.getEnergia());
        IO.println("Nível: " + p.getNivel());
    }
}
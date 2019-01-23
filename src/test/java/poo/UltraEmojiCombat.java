package poo;

public class UltraEmojiCombat {
    public static  void main(String [] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Petry Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        // l[0].ganharLuta();
        // l[0].apresentar();
        // l[0].status();

        l[1] = new Lutador("Sucata Man", "USA", 55, 1.95, 85.9, 15, 5, 0);
        l[2] = new Lutador("Cobolo Old", "Inglaterra", 70, 1.48, 73.5, 13, 3, 2);
        l[3] = new Lutador("PutScript", "Brasil", 40, 1.55, 75.5, 18, 1, 4);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[2], l[3]);
        UEC01.lutar();
        l[2].status();
        l[3].status();
    }
}

import java.util.Scanner;

public class Verwaltung {
    private Scanner scanner;
    private Ceasar ceasar;
    private Vigenere vigenere;
    public static void main(String[] args) {

        new Verwaltung();
        System.out.println("Herzlich Willkommen zu Zeichenketten Tester!");

    }
    public Verwaltung(){
        scanner = new Scanner(System.in);
        ceasar= new Ceasar();
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("Bitte wähle mit welcher Methode du verschlüsseln möchtest");
            System.out.println("[1]Ceasar");
            System.out.println("[2]Vigenere");
            int option = scanner.nextInt();
            if(option==1) {
                ceasar = new Ceasar();
                System.out.println("[1] Ein Wort verschlüsseln (Benötigt ein KlarText und ein Schlüssel)");
                System.out.println("[2] Ein wort entschlüsseln (benötigt ein GeheimText und ein Schlüssel)");

                option = scanner.nextInt();
                if (option == 1) {
                    System.out.println("Bitte gib den zu verschlüsselnden Text an");
                    String optionString = scanner.next();
                    ceasar.setKt(optionString);
                    System.out.println("Bitte gib eine Zahl als Schlüssel an");
                    option = scanner.nextInt();
                    ceasar.setS(option);
                    ceasar.verschluesseln();
                    System.out.println("Dein verschlüsseltes Wort ist: " + ceasar.getGt());
                }
                if (option == 2) {
                    System.out.println("Bitte gib den verschlüsselten Text an");
                    String optionString = scanner.next();
                    ceasar.setGt(optionString);
                    System.out.println("Bitte gib die Zahl des Schlüssels an");
                    option = scanner.nextInt();
                    ceasar.setS(option);
                    ceasar.entschluesseln();
                    System.out.println("Der Klartext ist " + ceasar.getKt());

                }
                if (option == 3) {

                }

            }else if(option==2){
                vigenere=new Vigenere();
                String schluessel;
                System.out.println("[1] Ein Wort verschlüsseln (Benötigt einen KlarText und einen Schlüssel)");
                System.out.println("[2] Ein wort entschlüsseln (Benötigt einen GeheimText und einen Schlüssel)");

                option = scanner.nextInt();
                if (option == 1) {
                    System.out.println("Bitte gib den zu verschlüsselden text an");
                    String optionString = scanner.next();
                    vigenere.setKt(optionString);
                    System.out.println("Bitte gib den Schlüssel an");
                    schluessel = scanner.next();
                    vigenere.setS(schluessel);
                    vigenere.verschluesseln();
                    System.out.println("Dein verschlüsseltes wort ist: " + vigenere.getGt());
                }
                if (option == 2) {
                    System.out.println("Bitte gib den verschlüsselten text an");
                    String optionString = scanner.next();
                    vigenere.setGt(optionString);
                    System.out.println("Bitte gib den Schlüssel an");
                    schluessel = scanner.next();
                    vigenere.setS(schluessel);
                    vigenere.entschluesseln();
                    System.out.println("Der Klartext ist " + vigenere.getKt());

                }
            }
        }
    }
}

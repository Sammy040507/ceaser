public class Vigenere {
    private String gt;
    private String kt;
    private String s;
    // Der Geheimtext, Klartext und der Schlüssel wird in "gt", "kt" und "s" gespeichert.
    public Vigenere(){ // Konstruktor:
        gt="";
        kt="";
        s="a";
    }
    public void verschluesseln(){
        gt="";
        String tkt= kt.toUpperCase(); // Der Klartext wird in Großbuchstaben umgewandelt und in "tkt" gespeichert.
        System.out.println(kt); // Der Klartext wird ausgegeben.
        String TemporerString= s.toUpperCase();
        // Der Schlüssel wird in Großbuchstaben umgewandelt und in "TemporerString" gespeichert
        for(int i=0;i<tkt.length();i++){
            int h = this.getAscif(tkt.charAt(i));
            int stemporer=( TemporerString.charAt(i%TemporerString.length())-65)%26;
            gt= gt + this.getChar(((h+stemporer-39)%26)+65) ;
        }
    }
    public void entschluesseln(){
        kt="";
        String tgt= gt.toUpperCase();
        String TemporerString= s.toUpperCase();
        for(int i=0;i<tgt.length();i++) {
            int h = this.getAscif(tgt.charAt(i));
            int stemporer=(TemporerString.charAt(i%TemporerString.length())-65)%26;
            kt +=  this.getChar(((h-stemporer-39)%26)+65);
        }
    }

    private char getChar(int pWert){
        return (char) pWert;
    }
    private int getAscif(char pWert){
        return (int) pWert;
    }
    public String getGt(){
        return gt;
    }
    public void setGt(String pGt){
        gt=pGt;
    }
    public String getKt(){
        return kt;
    }
    public void setKt(String pKt){
        kt=pKt;
    }
    public String getS(){return s;}
    public void setS(String pschluessel) {s=pschluessel;}
}
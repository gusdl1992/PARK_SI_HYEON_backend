package 박시현개인연습.textRPG;

public class Character {

    private String name;
    private int hp = 100;
    private int mp = 50;
    private int str = 10;
    private int def = 10;
    private int wsd = 10;
    private int spd = 10;

    Character(){
        this.name = "홍길동";
    }
    Character(String name){
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getWsd() {
        return wsd;
    }

    public void setWsd(int wsd) {
        this.wsd = wsd;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mp=" + mp +
                ", str=" + str +
                ", def=" + def +
                ", wsd=" + wsd +
                ", spd=" + spd +
                '}';
    }
}

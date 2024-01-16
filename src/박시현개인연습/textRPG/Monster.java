package 박시현개인연습.textRPG;

public class Monster {

    private String name;
    private int hp;
    private int str;
    private int def;
    private int spd;

    Monster(){}
    Monster(String name , int hp , int str , int def , int spd){
        this.name = name;
        this.hp = hp;
        this.str = str;
        this.def = def;
        this.spd = spd;
    }

    void mattack(Character character){
        System.out.println(name + "의 공격!" + character.getName() +"에게" + (str-character.getDef())+ "데미지를 주었다!");
        int mhp = str - character.getDef();
        character.battleHp(mhp);
        System.out.println(character.getName() + "의 남은 체력 : " + character.getHp());

    }

    public void battleHp(int dmg){
        this.hp -= dmg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }
}

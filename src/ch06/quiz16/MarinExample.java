package ch06.quiz16;

public class MarinExample {
    public static void main(String[] args) {

        Marine m1 = new Marine();
        m1.move(100, 200);
        m1.weaponUp();
        m1.weaponUp();
        m1.armorUp();
        System.out.println("m1의 공격력: " + m1.weapon);
        System.out.println("m1의 방어력: " + m1.armor);


        Marine m2 = new Marine();
        m2.move(100, 200);
        System.out.println("m2의 공격력: " + m2.weapon);
        System.out.println("m2의 방어력: " + m2.armor);

        Marine m3 = new Marine();
        m3.move(100, 200);
        System.out.println("m3의 공격력: " + m3.weapon);
        System.out.println("m3의 방어력: " + m3.armor);

    }
}

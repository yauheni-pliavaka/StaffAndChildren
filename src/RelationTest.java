public class RelationTest {
    public static void main(String[] args) {
        Staff s1 = new Staff("Bob", "fff", "ooo", "21.01.1985", true);
        Staff s2 = new Staff("Tom", "aaa", "bbb", "11.12.1983", true);
        Child c1 = new Child("Kate", "fff", "bobob", "05.09.2000", false);
        Child c2 = new Child("Roma","aaa", "tomtom", "09.01.1999", true);
        s1.setRelation(c1);
        c2.setRelation(s2);

        System.out.println(s2.humanArrayList.get(0).getName());
        System.out.println(c2.humanArrayList.get(0).getName());
    }
}

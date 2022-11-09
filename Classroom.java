public class Classroom {
    public static void main(String[] args) {
        Wilder hercule = new Wilder("Hercule", true);
        Wilder joey = new Wilder("José", false);

        System.out.println(hercule.whoAmI());
        System.out.println(joey.whoAmI());
    }

}
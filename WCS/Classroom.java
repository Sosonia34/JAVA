package WCS;

 public class Classroom {
    public static void main(String[] args) {

     Wilder jc = new Wilder("Jean-claude", true);
        System.out.println(jc.whoAmI());

        Wilder hr = new Wilder("Henri", false);
        System.out.println(hr.whoAmI());
    }
}

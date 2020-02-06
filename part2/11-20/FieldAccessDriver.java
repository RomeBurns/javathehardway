public class FieldAccessDriver{
    public static void main( String[] args ){
        FieldAccess j = new FieldAccess("Robert", "Parker", "Butch");
        System.out.println(j.getfullName());

        j.setLast("Elliott");
        j.setFirst("Samuel");
        j.setNick("sam");
        System.out.println(j.getfullName());

        j.first = "Avery";
        System.out.println(j.nick);
    }
}
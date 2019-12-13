public class TVActorDriver {
    public static void main( String[] args ) {
        TVActor a = new TVActor();
        a.name = "thomas middleditch";
        a.role = "richard hendricks";
        TVActor b = new TVActor();
        b.name = "martin starr";
        b.role = "bertram gilfoil";
        TVActor c = new TVActor();
        c.name = "kumal ninjaini";
        c.role = "dinesh chugtai";
        System.out.println(a.name + " played " + a.role);
        System.out.println(b.name + " played " + b.role);
        System.out.println(c.name + " played " + c.role);
    }
}
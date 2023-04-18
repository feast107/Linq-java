import java.util.ArrayList;
import java.util.List;

class Foo{
    static int Count = 0;
    public int sequence = ++Count;
    public int priority = Integer.MAX_VALUE - sequence;

    public String name = "This is number:" + Count + " of Foo , whose priority is:"+priority;

    @Override
    public String toString(){
        return name;
    }
}

public class TestMain {
    private static final List<Foo> List = new ArrayList<>(){ };

    public static void main(String[] __){
        List.add(new Foo());
        List.add(new Foo());
        List.add(new Foo());
        List.add(new Foo());
        List.add(new Foo());
        List.add(new Foo());
        List<Foo> temp = new ArrayList<>();
        List
                .orderBy(x->x.priority)
                .aggregate(temp,(s,i)->{ System.out.println(i); return List; })
                .orderByDescending(x->x.sequence)
                .aggregate(temp,(s,i)->{ System.out.println(i); return List; })
                .where(x->x.sequence > 3)
                .aggregate(temp,(s,i)->{ System.out.println(i); return List; })
                .select(x->x.name)
                .forEach(System.out::println);
    }
}

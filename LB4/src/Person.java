import java.util.Objects;
public class Person implements InterfaceActionPeople {
    private String name;
    @Override
    public String sleep(){
        return "можно спать";
    }
    public String sleep(HomeCarlson homeCarlson){
        return TimeOfDay.NIGHT.getDay()+" "+ "можно спать"+" "+homeCarlson.sizePorch("крохотное");}
    @Override
    public String getName() {
        this.name=name;
        return this.name;
    }
    @Override
    public String sit() {
        return "приятно сидеть"+ " "+ TimeOfDay.EVENING.getDay();
    }

    @Override
    public String see() {
        return "глядеть на звезды";
    }

    @Override
    public String drink() {
        return "пить сок";
    }

    @Override
    public String eat() {
        return "грызть";
    }

    @Override
    public String getUp() {
        return "когда проснешься";
    }

    @Override
    public String find() {
        return "обнаружить его трудно";
    }
    public String admire() {
        class Sun {
            private final String title = "Солнце";
            public String titleCondition() {
                return title;
            }
            public String sunrise() {
                return titleCondition() + " встает над крышами домов где-то за Остермальмом.";

            }
        }
        Sun sun=new Sun();
        return "любоваться"+" "+ sun.sunrise();
    }
    @Override
    public String wander() {
        return "бродишь";
    }
    public String wander(HomeCarlson homeCarlson){
        return "бродишь"+" "+ homeCarlson.getPlace("по крышам");
    }

    @Override
    public String search() {
        return "не ищешь привидений";
    }
    public String search(HomeCarlson homeCarlson){
        return "не ищещь привидений"+" "+homeCarlson.whatPipe("дымовыми");
    }
    public String imagine(HomeCarlson homeCarlson){
        return "Представьте"+" " +homeCarlson.colorWindow("зелененые")+" "+homeCarlson.sizePorch("крохотное");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}

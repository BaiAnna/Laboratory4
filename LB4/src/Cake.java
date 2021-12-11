import java.nio.channels.CancelledKeyException;
import java.util.Objects;

public class Cake implements InterfaceFood {
    private String food ;
    @Override
    public String whatFood(String food) {
        this.food=food;
        return this.food;
    }


    public String have(boolean b, Person person) throws CakeException {
        if (b==false){
            throw new CakeException("Cake no");
        }
        else return person.eat()+ " "+ whatFood("пряники") + " "+ "есть";
    }
    @Override
    public String toString(){
        return food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cake cake = (Cake) o;
        return Objects.equals(food, cake.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food);
    }
}

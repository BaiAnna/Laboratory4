import java.util.Objects;

public class SmallHome extends AbstractHome {
    private String m="Маленькие";
    private String size;
    @Override
    public String whatHome(){
        return m+" "+"домики";
    }
    public String cozy() {
        return "всегда очень уютны";
    }
    @Override
    public String getPlace(String place){
        return place;
    }
    @Override
    public String toString (){
        return size;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmallHome allHome = (SmallHome) o;
        return Objects.equals(size, allHome.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }
}
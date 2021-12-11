import java.util.Objects;

public class HomeCarlson extends AbstractHome {
    private String w="Карлсона";
    private String place;
    private String window;
    private String porch;
    private String pipe;
    @Override
    public String whatHome(){
        return "домик"+" "+ w;
    }
    public String colorWindow(String color){
        window=color;
        return window +" "+ "ставенки";
    }
    public String sizePorch(String porch){
        this.porch=porch;
        return this.porch+" "+"крылечко";
    }
    public String whatPipe(String pipe){
        this.pipe=pipe;
        return pipe+" "+"трубами";
    }
    @Override
    public String getPlace(String place){
        this.place=place;
        return this.place;
    }
    public String cozy(){
        return "особенно уютен"+" "+whatHome();
    }

    public String hot(int tem){
        if (tem<25){
            throw new HomeCarlsonHotRuntimeException("In HomeCarlson not hot");
        }
        else return "в домике слишком жарко";

    }
    public String stand(Person person ){
        return "удачно примостился за выступом"+" "+person.find();
    }
    @Override
    public String toString(){
        return place+" "+window+""+ porch+" "+pipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeCarlson that = (HomeCarlson) o;
        return Objects.equals(place, that.place) && Objects.equals(window, that.window) && Objects.equals(porch, that.porch) && Objects.equals(pipe, that.pipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(place, window, porch, pipe);
    }
}
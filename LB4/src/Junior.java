public class Junior implements InterfaceNamePeople{
    private String name="Малыш";
    @Override
    public String getName(){
        return name;
    }
    public String say(){
        return "Здесь,наверху, все ни на что не похоже-сказал Малыш";
    }
    public String see(){
        return name+" "+"посмотрел вокруг";
    }
    public String shout(){
        return "Куда ни глянь,крыши!-воскликнул"+" "+name;
    }



}

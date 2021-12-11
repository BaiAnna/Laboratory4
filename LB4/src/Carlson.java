public class Carlson implements InterfaceNamePeople{
    private String name="Карлсон";
    private static String m="моторчик";
    private String arm;
    private String buttonOnStomach=" кнопка на животе";
    @Override
    public String getName(){
        return name;
    }
    public String whatArm(String arm){
        this.arm=arm;
        return this.arm+" "+ "ручками";
    }
    public static class Motor {
        public String spin() {
            return m+" "+"затарахтел";
        }
    }
    public String click(){
        return getName()+" "+"нажал"+" "+buttonOnStomach+" ";
    }
    public String land(HomeCarlson homeCarlson){
        return getName()+" "+"приземлился на"+homeCarlson.sizePorch("крохотное")+"своего дома";
    }
    public String answer(FunctionalInterfaceGoodEmotions emotions){
        return emotions.getGoodEmotions("К счастью")+" "+getName()+" "+"ответил";
    }
    public String embrace(Junior junior){
        return getName()+" "+"обхватил"+junior.getName()+whatArm("своими пухленькими");
    }



}

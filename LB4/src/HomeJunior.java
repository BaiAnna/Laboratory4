public class HomeJunior extends AbstractHome {
    private String householder="Малыша";
    private String colorOfCurtain="тюлевые";
    private String colorOfFringe="черной";
    @Override
    public String whatHome() {
        return "домик" + " " + householder;
    }
    public class Curtain {
        public String materialOfCurtain() {
            return  colorOfCurtain + " " + "занавески"+" "+ colorOfFringe+" "+"бахромой";
        }
        public String swing (){
            return "раскачивались";
        }
        public String wave(Carlson carlson, Junior junior){
            return "словно махали" +" "+carlson.getName()+" "+junior.getName()+" "+"на прощанье";
        }
    }

}

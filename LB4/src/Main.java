public class Main {
    public static void main(String args[]) {
        Person person = new Person();
        HomeCarlson homeCarlson = new HomeCarlson();
        SmallHome smallHome = new SmallHome();
        Cake cake = new Cake();
        Carlson carlson = new Carlson();
        Junior junior = new Junior();
        HomeJunior homeJunior= new HomeJunior();
        They they=new They();
        HomeJunior.Curtain curtain= homeJunior.new Curtain();
        Carlson.Motor motor=new Carlson.Motor();
        InterfaceNotDo nobody= new InterfaceNotDo(){
            private String who="Никто";
            @Override
            public String notDo(){
                return who+" "+"этим  не занимается";
            }
        };
        System.out.println(carlson.click()+" "+ motor.spin());
        System.out.println(carlson.embrace(junior)+" "+they.fly());
        System.out.println(curtain.materialOfCurtain()+" "+curtain.swing()+" "+curtain.wave(carlson, junior));
        System.out.println(smallHome.whatHome()+" "+smallHome.getPlace("На крышах")+" "+smallHome.cozy()+" "+homeCarlson.cozy());
        try {
            System.out.println(person.imagine(homeCarlson)+" "+ person.sit()+" " + person.see()+" "+person.drink()+" "+cake.have(true, person));
        } catch (CakeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(person.sleep(homeCarlson)+" "+homeCarlson.hot(30));
        System.out.println(person.getUp()+" "+person.admire());
        System.out.println(homeCarlson.cozy()+" "+homeCarlson.stand(person));
        System.out.println(person.wander(homeCarlson)+" "+person.search(homeCarlson));
        System.out.println(nobody.notDo());
        System.out.println(junior.say()+" "+carlson.land(homeCarlson));
        FunctionalInterfaceGoodEmotions emotions;
        emotions = (String e)-> e;
        System.out.println(carlson.answer(emotions));
        System.out.println(junior.see());
        System.out.println(junior.shout());
    }
}
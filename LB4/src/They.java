public class They implements InterfaceNamePeople{
    private String name="Они";
    @Override
    public String getName(){
        return name;
    }
    public String fly(){
        return getName()+" "+"вылетили в окно и стали набирать высоту";
    }

}

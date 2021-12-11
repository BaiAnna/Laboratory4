public enum TimeOfDay {
    AFTERNOON("Днем"), NIGHT("Ночью"), MORNING("Утром"), EVENING("По Вечерам");
    private String day;
    public String  getDay(){
        return day;
    }

    TimeOfDay(String d) {
        day=d;
    }

}
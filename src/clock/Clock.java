package clock;

public class Clock {
//    private int h;
//    private int min;

    private Display hour = new Display(24);
    private Display minute = new Display(60);

//    public Display hour = new Display(h);
//    public Display minute = new Display(min);
//    public Clock(int h, int min){
//        this.h = h;
//        this.min = min;
//    }


    public void start(){
        while (true){
            minute.increase();
            if (minute.getValue() == 0){
                hour.increase();
            }
            System.out.println(hour.getValue()+":"+minute.getValue());
        }
    }

    public static void main(String[] args) {
//        Clock c = new Clock(3,5);
        Clock c = new Clock();
        c.start();

    }
}

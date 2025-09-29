package programs.timeop;

public class Time {
    byte hrs;
    byte mins;
    public void setTime(byte hrs, byte mins){
        this.hrs=hrs;
        this.mins=mins;
    }
    public void showTime(){
        System.out.println("Hr: "+this.hrs+":"+this.mins);
    }
    public Time addTime(Time t1,Time t2){
      Time t3 =new Time();


      return t3;
    }

}

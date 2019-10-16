package XayDungLopStopWatch;

public class StopWatch {
    private long starTime;
    private long endTime;

    public StopWatch(){

    }

    public StopWatch(long starTime, long endTime) {
        this.starTime = starTime;
        this.endTime = endTime;
    }

    //GETTER
    public long getStarTime() {
        return starTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getElapsedTime(){
        return this.endTime-this.starTime;
    }

//SETTER
    public void setStarTime(long starTime) {
        this.starTime = starTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start(){
        this.starTime = System.currentTimeMillis();
    }

    public void end(){
        this.endTime = System.currentTimeMillis();
    }

}

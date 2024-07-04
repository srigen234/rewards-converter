public class RewardValue {
    private int miles;
    private double cash;

    public RewardValue(int miles){
        this.miles=miles;
        this.cash=miles*0.0035;
    }

    public RewardValue(double cash){
        this.cash = cash;
        miles=(int)(cash*285.714285714);
    }

    public double getCashValue(){
        return cash;
    }

    public int getMilesValue(){
        return miles;
    }
}

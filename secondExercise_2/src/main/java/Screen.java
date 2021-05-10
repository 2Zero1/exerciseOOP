public class Screen {
    int sequence;
    Movie movie;
    int startTime;
    int endTime;
    double fee;
    DiscountPolicy discountPolicy;

    public Screen(int sequence, Movie movie, int startTime, int endTime, double fee, DiscountPolicy discountPolicy) {
        this.sequence = sequence;
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = endTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public double getFee() {
        return fee;
    }

    public double calculateFee() {
        return this.fee - discountPolicy.calculateDiscountFee(this);
    }
}

public class StringSumAdapter implements StringSum{
    IntSum intSum;
    public StringSumAdapter(IntSum intSum){
        this.intSum = intSum;
    }

    @Override
    public String sum(String a, String b) {
        return a + " " + b;
    }
}

public class Summ {
    public float calculate(float n, float x) {
        float result = 0f;
        for(int i = 1; i <= n; i++) {
            result = result + (x * x + 1) / i;
        }
        return result;
    }
}

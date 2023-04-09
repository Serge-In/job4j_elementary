import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SampleTestJunit {

    @Test //Проверка целочисленных значений.
    public void whenEquals() {
        int result = 1;
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test //Проверка чисел с плавающей точкой.
    public void whenFloatPoint() {
        float result = 1.0000001F;
        float expected = 1F;
        assertThat(result).isCloseTo(expected, offset(0.01F));
    }

    @Test //Равенство массивов.
    public void whenArray() {
        short[] result = {1, 2, 3};
        int[] expected = {1, 2, 3};
        assertThat(result).containsExactly(expected);
        assertThat(result).toString();
    }
}
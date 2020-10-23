package normal._12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/10/23
 */
public class TestRunner {

    @Test
    public void test() {
        Assertions.assertEquals(new Solution().intToRoman(3), "III");
        Assertions.assertEquals(new Solution().intToRoman(4), "IV");
        Assertions.assertEquals(new Solution().intToRoman(8), "VIII");
        Assertions.assertEquals(new Solution().intToRoman(9), "IX");
        Assertions.assertEquals(new Solution().intToRoman(48), "XLVIII");
        Assertions.assertEquals(new Solution().intToRoman(1994), "MCMXCIV");
    }

}

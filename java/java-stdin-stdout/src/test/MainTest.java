import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by jrobles on 29/7/17.
 */
public class MainTest {
    @Test
    public void testMain() throws Exception {
        String[] args = new String[]{"test2.txt"};
        Main.main(args);
    }

}
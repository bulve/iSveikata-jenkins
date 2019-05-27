package lt.vtvpmc.ems.isveikata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class Tests {

    @Test
    public void should(){
        String str = "Whatever";
        assertThat(true, is(true));
        assertThat(str, is(notNullValue()));
    }
}

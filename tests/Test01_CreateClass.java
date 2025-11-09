import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test01_CreateClass {
    @Test
    public void testCreateStack() {
        Stack<Integer> stack = new Stack<>();
        assertNotNull(stack, "Stack should not be null");
    }
}

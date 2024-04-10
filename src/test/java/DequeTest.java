import static org.junit.Assert.*;
import org.junit.*;

public class DequeTest {
    private Deque<Integer> deque;

    @Before
    public void setUp() {
        deque = new Deque<>();
    }

    @Test
    public void testAddFront() {
        deque.addFront(1);
        assertEquals(1, deque.size());
        assertEquals(1, (int) deque.removeFront());
        assertEquals(0, deque.size());
    }

    @Test
    public void testAddTail() {
        deque.addTail(2);
        assertEquals(1, deque.size());
        assertEquals(2, (int) deque.removeTail());
        assertEquals(0, deque.size());
    }

    @Test
    public void testRemoveFront() {
        deque.addFront(3);
        deque.addFront(4);
        assertEquals(2, deque.size());
        assertEquals(4, (int) deque.removeFront());
        assertEquals(3, (int) deque.removeFront());
        assertEquals(0, deque.size());
    }

    @Test
    public void testRemoveTail() {
        deque.addTail(4);
        deque.addTail(5);
        assertEquals(2, deque.size());
        assertEquals(5, (int) deque.removeTail());
        assertEquals(1, deque.size());
    }
}


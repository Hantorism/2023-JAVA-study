package GUI_4_Threads;
import java.awt.EventQueue;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new MyFrame();
        });
    }

    /* 아래와 같습니다.
     * EventQueue.invokeLater(new Runnable() {
     *    public void run() {
     *      new MyFrame();
     *   } 
     * });
     */
}

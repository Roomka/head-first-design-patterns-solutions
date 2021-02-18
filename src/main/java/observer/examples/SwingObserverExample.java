package observer.examples;

import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        // angel listener.
        button.addActionListener(e -> System.out.println("Don't do it, you might regret it!"));
        // devil listener
        button.addActionListener(e -> System.out.println("Come on, do it!"));
    }

}

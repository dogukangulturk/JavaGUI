package frames;

public class Main {
    public static void main(String[] args) {
        //JFrame = a GUI window to add components to

        /*JFrame frame = new JFrame(); //create a frame
        fame.setTitle("JFrame title goes here"); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setResizable(false); //prevent frame from being resize
        frame.setSize(420,420); //set x- dimension, and y- dimension of frame
        frame.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.getContentPane().setBackground(new Color(123,50,250)); //change color of background*/

        MyFrame myFrame = new MyFrame();
    }
}

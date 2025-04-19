import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Program8 {
    public static void main(String[] args){
        Frame frame = new Frame();

        Label rollLbl = new Label("Roll No: ");
        rollLbl.setBounds(200,100, 100, 20);
        TextField rollNoIn = new TextField();
        rollNoIn.setBounds(200, 120, 100, 30);


        Label nameLbl = new Label("Name: ");
        nameLbl.setBounds(200,170, 100, 20);
        TextField nameIn = new TextField();
        nameIn.setBounds(200, 190, 100, 30);

        Label marksLbl = new Label("Marks: ");
        marksLbl.setBounds(200,240, 100, 20);
        TextField marksIn = new TextField();
        marksIn.setBounds(200, 260, 100, 30);

        Button submitBtn = new Button("Done");
        submitBtn.setBounds(200, 310, 100, 25);

        Label statusLbl = new Label();
        statusLbl.setBounds(150, 350, 200, 20);


        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter writer = new FileWriter("./StudentData.txt");
                    writer.write("Roll No:"+rollNoIn.getText()+"\n");
                    writer.write("Name:"+nameIn.getText()+"\n");
                    writer.write("Marks:"+marksIn.getText());
                    writer.close();
                    statusLbl.setText("Saved Data to StudentData.txt");
                } catch (IOException ex) {
                    statusLbl.setText("Failed to Saved the Data. "+ ex.getMessage());
                }
            }
        });



        frame.add(rollLbl);
        frame.add(rollNoIn);
        frame.add(nameLbl);
        frame.add(nameIn);
        frame.add(marksLbl);
        frame.add(marksIn);
        frame.add(submitBtn);
        frame.add(statusLbl);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
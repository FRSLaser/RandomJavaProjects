import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Calculator {
    private JPanel Calculator;
    private JButton delButton;
    private JTextField txtDisplay;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton ACButton;
    private JButton a1Button;
    private JButton a4Button1;
    private JButton a7Button1;
    private JButton a00Button;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a5Button1;
    private JButton a8Button1;
    private JButton a0Button;
    private JButton button16;
    private JButton a3Button1;
    private JButton a6Button1;
    private JButton a9Button1;
    private JButton button20;

    double a,b,result;
    char op;
    public Calculator() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtDisplay.setText("");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtDisplay.setText(txtDisplay.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtDisplay.setText(txtDisplay.getText() + a2Button.getText());
            }
        });
        a3Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtDisplay.setText(txtDisplay.getText() + a3Button1.getText());
            }
        });
        a4Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtDisplay.setText(txtDisplay.getText() + a4Button1.getText());
            }
        });
        a5Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtDisplay.setText(txtDisplay.getText() + a5Button1.getText());
            }
        });
        a6Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtDisplay.setText(txtDisplay.getText() + a6Button1.getText());
            }
        });
        a7Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtDisplay.setText(txtDisplay.getText() + a7Button1.getText());
            }
        });
        a8Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtDisplay.setText(txtDisplay.getText() + a8Button1.getText());
            }
        });
        a9Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtDisplay.setText(txtDisplay.getText() + a9Button1.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtDisplay.setText(txtDisplay.getText() + a0Button.getText());
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtDisplay.setText(txtDisplay.getText() + a00Button.getText());
            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(txtDisplay.getText().contains(".")) {
                    double pm = Double.parseDouble(txtDisplay.getText());
                    pm = pm * -1;
                    txtDisplay.setText(String.valueOf(pm));
                }else
                {
                    long PM = Long.parseLong(txtDisplay.getText());
                    PM=PM*-1;
                    txtDisplay.setText(String.valueOf(PM));

                }

            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                a = Double.parseDouble(txtDisplay.getText());
                op='+';
                txtDisplay.setText("");

            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(!txtDisplay.getText().contains(".")){
                    txtDisplay.setText(txtDisplay.getText() + button20.getText());
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                a = Double.parseDouble(txtDisplay.getText());
                op='-';
                txtDisplay.setText("");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                a = Double.parseDouble(txtDisplay.getText());
                op='*';
                txtDisplay.setText("");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                a = Double.parseDouble(txtDisplay.getText());
                op='/';
                txtDisplay.setText("");
            }
        });
        delButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String backspace= null;
                if (txtDisplay.getText().length() > 0){
                    StringBuilder strB = new StringBuilder(txtDisplay.getText());
                    strB.deleteCharAt(txtDisplay.getText().length() - 1);
                    backspace=String.valueOf(strB);
                    txtDisplay.setText(backspace);
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                b=Double.parseDouble(txtDisplay.getText());
                if (op == '+'){
                    result=a+b;
                    txtDisplay.setText(String.valueOf(result));
                }else if (op == '-') {
                    result = a - b;
                    txtDisplay.setText(String.valueOf(result));
                }else if (op == '*') {
                    result = a * b;
                    txtDisplay.setText(String.valueOf(result));
                }else if (op == '/'){
                        result=a-b;
                        txtDisplay.setText(String.valueOf(result));}



            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

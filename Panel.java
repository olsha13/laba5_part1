package part1;

import java.awt.*;
import java.awt.event.*;

public class Panel extends Frame implements ItemListener, WindowListener, ActionListener {

    TextField text1, text2, result;
    Label l1, l2, lres, l;
    CheckboxGroup  actions;//sum, division, minus, multipl;
    Checkbox sum, division, minus, multipl;
    Button button;

    public Panel(){
        
        super("Калькулятор");
        addWindowListener((WindowListener) this);
        setSize(600, 600);

        l1 = new Label("1 число");
        text1 = new TextField("1");
        l2 = new Label("2 число");
        text2 = new TextField("2");
        
        actions = new CheckboxGroup();

        sum = new Checkbox("Сумма", actions, true);
        division = new Checkbox("Деление", actions, false);
        minus = new Checkbox("Вычитание", actions, false);
        multipl =new Checkbox("Умножение",actions,  false);
        
        
        button = new Button("Вычислить");
        
        lres = new Label("Результат");
        result = new TextField();
        l = new Label();


        l1.setBounds(100, 100, 100, 25);
        text1.setBounds(100, 130, 100, 25);
        l2.setBounds(100, 180, 100, 25);
        text2.setBounds(100, 210, 100, 25);
        

        sum.setBounds(250, 100, 100, 25);
        minus.setBounds(250, 130, 100, 25);
        multipl.setBounds(250, 180, 100, 25);
        division.setBounds(250, 210, 100, 25);

        button.setBounds(100, 250, 80, 25);

        lres.setBounds(100, 300, 100, 25);
        result.setBounds(100, 330, 100, 25);
        l.setBounds(300, 450, 100, 25);

        add(l1);
        add(text1);
        add(l2);
        add(text2);

        add(sum);
        add(minus);
        add(multipl);
        add(division);

        add(button);

        add(lres);
        add(result);
        add(l);

        button.addActionListener((ActionListener) this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int a, b, res = 0;
        a = Integer.parseInt(text1.getText());
        b = Integer.parseInt(text2.getText());
        if(sum.getState())
        {
            res = a+b;
        }
        else if(minus.getState())
        {
            res = a-b;
        }
        else if(multipl.getState())
        {
            res = a*b;
        }
        else if(division.getState())
        {
            res = a/b;
        }
        else
        {
            System.out.println("Чтото не так");
        }
        result.setText(Integer.toString(res));
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {    }
    @Override
    public void windowClosing(WindowEvent e) {
        this.dispose();
    }
    
    
}
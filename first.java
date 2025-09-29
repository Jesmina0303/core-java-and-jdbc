import java.awt.*;
import java.awt.event.*;

public class first extends Frame implements ActionListener{
    Label nameLabel,genderLabel,countryLabel,outputLabel;
    TextField nameField;
    CheckboxGroup genderGroup;
    Checkbox male,female;
    Choice countryChoice;
    Button submitButton;

    public  first()
    {
        setTitle("AWT Form Example");
        setSize(400,300);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);

        //handle window close
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        //name
        nameLabel=new Label("name");
        nameLabel.setBounds(50,50,60,70);
        add(nameLabel);

        nameField=new TextField();
        nameField.setBounds(120,50,200,20);
       
        add(nameField);
        
        //gender
        genderLabel=new Label("gender:");
        genderLabel.setBounds(50,90,60,20);
        add(genderLabel);

        genderGroup=new CheckboxGroup();
        male = new Checkbox("male",genderGroup,true);
        male.setBounds(120,90,70,20);
        add(male);

        female=new Checkbox("Female",genderGroup,false);
        female.setBounds(190,90,70,20);
        add(female);
        //country

        countryLabel=new Label("country:");
        countryLabel.setBounds(50,130,60,20);
        add(countryLabel);

        countryChoice=new Choice();
        countryChoice.add("USA");
        countryChoice.add("india");
        countryChoice.add("paris");
        countryChoice.add("london");
        countryChoice.add("swizerland");
        countryChoice.setBounds(120,130,200,20);
        add(countryChoice);

        //submit button
        submitButton=new Button("submit");
        submitButton.setBounds(150,170,80,30);
        submitButton.addActionListener(this);
        add(submitButton);

        //output Label
        outputLabel=new Label();
        outputLabel.setBounds(50,220,300,20);
        add(outputLabel);

        setVisible(true);


    }

    @Override

    public void actionPerformed(ActionEvent e){
        String name=nameField.getText().trim();
        if(name.isEmpty())
        {
            outputLabel.setText("please enter you name");
            return;

        }

        String gender=genderGroup.getSelectedCheckbox().getLabel();
        String country=countryChoice.getSelectedItem();

        String message="Hello"+name+"("+gender+")from "+country;
        outputLabel.setText(message);

    }
    public static void main(String[] args)
    {
        new first();
    }
}

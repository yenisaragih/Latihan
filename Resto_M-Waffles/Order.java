
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Order{
    private JFrame frame;
    private JOptionPane optionPane;

    boolean setvisible;


    ImageIcon image1 = new ImageIcon(getClass().getResource("papan.jpg"));
    JLabel gambarBackground1 = new JLabel(image1);

    JButton count= new JButton ("COUNT");
    JButton bill= new JButton ("B I L L");
    JTextField txbill=new JTextField();
    JButton money=new JButton ("YOUR MONEY");
    JTextField txmoney=new JTextField();
    JButton change=new JButton ("YOUR CHANGE");
    JTextField txchange=new JTextField();
    JButton reset= new JButton ("RESET");
    JButton exit=new JButton ("EXIT");
    
    
    JLabel lborder=new JLabel("YOUR ORDER");
    JTextField txorder=new JTextField(100);

    JLabel lbWaffles=new JLabel ("WAFFLES");
    JTextField txWaffles=new JTextField(100);

    JLabel lbBanana=new JLabel ("BANANA WAFFLE");
    JTextField txBanana=new JTextField("0");

    JLabel lbBelgian=new JLabel ("BELGIAN WAFFLE");
    JTextField txBelgian=new JTextField("0");

    JLabel lbRoll=new JLabel ("ROLL WAFFLE");
    JTextField txRoll=new JTextField("0");
        
    JLabel lbCaramel=new JLabel ("CARAMEL WAFFLE");
    JTextField txCaramel=new JTextField("0");
    
    JLabel lbDrinks=new JLabel ("DRINKS");
    JTextField txDrinks=new JTextField(10);
    
    JLabel lbHot=new JLabel ("HOT CHOCOLATE");
    JTextField txHot=new JTextField("0");

    JLabel lbMiami=new JLabel ("MIAMI COCKTAIL");
    JTextField txMiami=new JTextField("0");
    
    JLabel lbMango=new JLabel ("MANGO COCKTAIL");
    JTextField txMango=new JTextField("0");
        
    JLabel lbCoffee=new JLabel ("COFFEE LATE");
    JTextField txCoffee=new JTextField("0");
        
  
    public Order(){
        makeFrame();
        frame.setVisible(true);
        AksiReaksi();

    }

       private void makeFrame(){
        frame = new JFrame ("Order");
        frame.setSize(600, 600);
        KomponenVisual();
       
    }

    public void KomponenVisual(){

        JPanel panel = (JPanel)frame.getContentPane();
        panel.setLayout (null);

        panel.add(lborder);
        lborder.setBounds(220,20,200,20);
        lborder.setForeground(Color.white);
        lborder.setFont(new Font("PWChalk", Font.BOLD, 20));

        panel.add(lbWaffles);
        lbWaffles.setBounds(10,60,100,20);
        lbWaffles.setForeground(Color.black);
        lbWaffles.setFont(new Font("PWChalk", Font.BOLD, 18));

        panel.add(lbBanana);
        lbBanana.setBounds(10,120,400,20);
        panel.add(txBanana);
        txBanana.setBounds(200,120,30,20);
        lbBanana.setForeground(Color.white);
        lbBanana.setFont(new Font("PWChalk", Font.BOLD, 18));

        panel.add(lbBelgian);
        lbBelgian.setBounds(10,150,400,20);
        panel.add(txBelgian);
        txBelgian.setBounds(200,150,30,20);
        lbBelgian.setForeground(Color.white);
        lbBelgian.setFont(new Font("PWChalk", Font.BOLD, 18));

        panel.add(lbRoll);
        lbRoll.setBounds(10,180,400,20);
        panel.add(txRoll);
        txRoll.setBounds(200,180,30,20);
        lbRoll.setForeground(Color.white);
        lbRoll.setFont(new Font("PWChalk", Font.BOLD, 18));

        panel.add(lbCaramel);
        lbCaramel.setBounds(10,210,400,20);
        panel.add(txCaramel);
        txCaramel.setBounds(200,210,30,20);
        lbCaramel.setForeground(Color.white);
        lbCaramel.setFont(new Font("PWChalk", Font.BOLD, 18));

        panel.add(lbDrinks);
        lbDrinks.setBounds(10,270,100,20);
        lbDrinks.setForeground(Color.black);
        lbDrinks.setFont(new Font("PWChalk", Font.BOLD, 18));

        panel.add(lbHot);
        lbHot.setBounds(10,330,400,20);
        panel.add(txHot);
        txHot.setBounds(200,330,30,20);
        lbHot.setForeground(Color.white);
        lbHot.setFont(new Font("PWChalk", Font.BOLD, 18));

        panel.add(lbMiami);
        lbMiami.setBounds(10,360,400,20);
        panel.add(txMiami);
        txMiami.setBounds(200,360,30,20);
        lbMiami.setForeground(Color.white);
        lbMiami.setFont(new Font("PWChalk", Font.BOLD, 18));

        panel.add(lbMango);
        lbMango.setBounds(10,390,400,20);
        panel.add(txMango);
        txMango.setBounds(200,390,30,20);
        lbMango.setForeground(Color.white);
        lbMango.setFont(new Font("PWChalk", Font.BOLD, 18));
        
        panel.add(lbCoffee);
        lbCoffee.setBounds(10,420,400,20);
        panel.add(txCoffee);
        txCoffee.setBounds(200,420,30,20);
        lbCoffee.setForeground(Color.white);
        lbCoffee.setFont(new Font("PWChalk", Font.BOLD, 18));

        panel.add(bill);
        bill.setBounds(250,210,150,30);
        panel.add(txbill);
        txbill.setBounds(430,210,150,30);
        bill.setForeground(Color.black);
        bill.setFont(new Font("PWChalk", Font.BOLD, 14));
                
        panel.add(count);
        count.setBounds(380,150,100,30);
        count.setForeground(Color.black);
        count.setFont(new Font("PWChalk", Font.BOLD, 14));

        panel.add(money);
        money.setBounds(250,250,150,30);
        panel.add(txmoney);
        txmoney.setBounds(430,250,150,30);
        money.setForeground(Color.black);
        money.setFont(new Font("PWChalk", Font.BOLD, 12));
        
        panel.add(change);
        change.setBounds(250,290,150,30);
        panel.add(txchange);
        txchange.setBounds(430,290,150,30);
        change.setForeground(Color.black);
        change.setFont(new Font("PWChalk", Font.BOLD, 12));
             
        panel.add(reset);
        reset.setBounds(450,450,100,30);
        reset.setForeground(Color.black);
        reset.setFont(new Font("PWChalk", Font.BOLD, 16));
        
        panel.add(exit);
        exit.setBounds(450,500,100,30);
        exit.setForeground(Color.black);
        exit.setFont(new Font("PWChalk", Font.BOLD, 16));
        
        panel.add(gambarBackground1);
        gambarBackground1.setBounds(0,0,900,700);

    }

    public void AksiReaksi (){
        count.addActionListener (new ActionListener()
        {
                public void actionPerformed(ActionEvent e){
                    String bn=txBanana.getText();
                    int xbanana=(Integer.parseInt(bn))*30000;

                    String bl=txBelgian.getText();
                    int xbelgian=(Integer.parseInt(bl))*40000;

                    String rol =txRoll.getText();
                    int xroll=(Integer.parseInt(rol))*25000;

                    String car=txCaramel.getText();
                    int xcaramel=(Integer.parseInt(car))*35000;

                    String hotc=txHot.getText();
                    int xhot=(Integer.parseInt(hotc))*25000;

                    String mia=txMiami.getText();
                    int xmiami=(Integer.parseInt(mia))*30000;

                    String mng=txMango.getText();
                    int xmango=(Integer.parseInt(mng))*30000;

                    String coffe=txCoffee.getText();
                    int xcoffee=(Integer.parseInt(coffe))*25000;


                    int price = xbanana+xbelgian+xroll+xcaramel+xhot+xmiami+xmango+xcoffee;;
                    txbill.setText(""+price);

                }
            });
        reset.addActionListener (new ActionListener()
        {
                public void actionPerformed(ActionEvent e){
                    txBanana.setText("0");
                    txBelgian.setText("0");
                    txRoll.setText("0");
                    txCaramel.setText("0");
                    txHot.setText("0");
                    txMiami.setText("0");
                    txMango.setText("0");
                    txCoffee.setText("0");
                    
                    txbill.setText("");
                    txmoney.setText("");
                    txchange.setText("");

                }

            });
        change.addActionListener (new ActionListener()
        {
                public void actionPerformed(ActionEvent e){
                      long yourMoney;
                      long theBill;
                    try{
                        yourMoney  = Long.parseLong(txmoney.getText());
                    }
                    catch(NumberFormatException error)
                    {
                        yourMoney=0;
                        txmoney.setText(""+yourMoney);
                    }
                    
                    try{
                          theBill= Long.parseLong(txbill.getText());
                    }
                    catch(NumberFormatException error)
                    {
                        theBill= 0;
                        txbill.setText(""+theBill);
                    }
                    
                    if(yourMoney>=theBill)
                    {
                        yourMoney-=theBill;
                        txchange.setText(""+yourMoney);
                        txchange.setForeground(Color.black);
                        txchange.setFont(new Font("Calibri", Font.BOLD, 14));
                    }
                    else
                    {
                        txchange.setText("    It's not enough!");
                        txchange.setForeground(Color.red);
                        txchange.setFont(new Font("Chiller", Font.BOLD, 18));
                    }
                }         
                }); 
        exit.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e){
                        frame.setVisible(false);
                    }
                });
     }
    }

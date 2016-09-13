import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;


      public class Menu
      {
        private JFrame frame;
        private JOptionPane optionPane;
        
        boolean setvisible;
        
        ImageIcon image = new ImageIcon(getClass().getResource("papan1-.png"));
        JLabel gambarBackground = new JLabel(image);   
          
        JLabel lbmw=new JLabel ("M / WAFFLES");
       
        JLabel lbWaffles=new JLabel ("WAFFLES");
        
        JButton pesan=new JButton ("ORDER");
        
        JButton keluar=new JButton ("CLOSE");
            
        JLabel lbBanana=new JLabel ("BANANA WAFFLE");
        JTextField txBanana=new JTextField("0");
        JLabel lbhrg1=new JLabel ("RP 30.000");
              
        JLabel lbBelgian=new JLabel ("BELGIAN WAFFLE");
        JTextField txBelgian=new JTextField("0");
        JLabel lbhrg2=new JLabel ("RP 40.000");
              
        JLabel lbRoll=new JLabel ("ROLL WAFFLE");
        JTextField txRoll=new JTextField("0");
        JLabel lbhrg3=new JLabel ("RP 25.000");
        
        JLabel lbCaramel=new JLabel ("CARAMEL WAFFLE");
        JTextField txCaramel=new JTextField("0");
        JLabel lbhrg4=new JLabel ("RP 35.000");
    
        JLabel lbDrinks=new JLabel ("DRINKS");
           
        JLabel lbHot=new JLabel ("HOT CHOCOLATE");
        JTextField txHot=new JTextField("0");
        JLabel lbhrg5=new JLabel ("RP 25.000");

        JLabel lbMiami=new JLabel ("MIAMI COCKTAIL");
        JTextField txMiami=new JTextField("0");
        JLabel lbhrg6=new JLabel ("RP 30.000");
    
        JLabel lbMango=new JLabel ("MANGO COCKTAIL");
        JTextField txMango=new JTextField("0");
        JLabel lbhrg7=new JLabel ("RP 30.000");
        
        JLabel lbCoffee=new JLabel ("COFFEE LATE");
        JTextField txCoffee=new JTextField("0");
        JLabel lbhrg8=new JLabel ("RP 25.000");
        
               
       
        public Menu(){
            
            makeFrame();
            frame.setVisible(true);
            AksiReaksi();
        
        }
    
           
        private void makeFrame(){
            
            frame = new JFrame ("Waffles");
            frame.setSize(900, 730);
            komponenVisual();
                  
       }
    
       public void komponenVisual(){
           JPanel panel = (JPanel)frame.getContentPane();
           panel.setLayout (null);
                 
           
           panel.add(lbmw);
           lbmw.setBounds(300,20,500,40);
           lbmw.setForeground(Color.white);
           lbmw.setFont(new Font("PWChalk", Font.ITALIC, 40));


           panel.add(lbWaffles);
           lbWaffles.setBounds(20,70,150,30);
           lbWaffles.setForeground(Color.black);
           lbWaffles.setFont(new Font("PWChalk", Font.ITALIC, 22));
           
          
           JLabel banana=new JLabel("");
           banana.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("banana.png")));
           banana.setBounds(30,110,100,100);
           
           panel.add(banana);
           panel.add(lbBanana);
           panel.add(lbhrg1);
           
           lbBanana.setBounds(25,220,200,20);
           lbBanana.setForeground(Color.white);
           lbBanana.setFont(new Font("PWChalk", Font.BOLD, 12));
           
           lbhrg1.setBounds(50,240,200,20);
           lbhrg1.setForeground(Color.black);
           lbhrg1.setFont(new Font("PWChalk", Font.BOLD, 12));
           
           
           JLabel belgian=new JLabel("");
           belgian.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("belgian.png")));
           belgian.setBounds(200,110,100,100);
           
           panel.add(belgian);
           panel.add(lbBelgian);
           panel.add(lbhrg2);
           
           lbBelgian.setBounds(190,220,200,20);
           lbBelgian.setForeground(Color.white);
           lbBelgian.setFont(new Font("PWChalk", Font.BOLD, 12));
           
           lbhrg2.setBounds(213,240,200,20);
           lbhrg2.setForeground(Color.black);
           lbhrg2.setFont(new Font("PWChalk", Font.BOLD, 12));
           
           
           JLabel roll=new JLabel("");
           roll.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("roll.png")));
           roll.setBounds(390,110,100,100);
           
           panel.add(roll);
           panel.add(lbRoll);
           panel.add(lbhrg3);
           
           lbRoll.setBounds(394,220,200,20);
           lbRoll.setForeground(Color.white);
           lbRoll.setFont(new Font("PWChalk", Font.BOLD, 12));
           
           lbhrg3.setBounds(410,240,200,20);
           lbhrg3.setForeground(Color.black);
           lbhrg3.setFont(new Font("PWChalk", Font.BOLD, 12));
           
           
           JLabel caramel=new JLabel("");
           caramel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("caramel.png")));
           caramel.setBounds(580,110,100,100);
           
           panel.add(caramel);
           panel.add(lbCaramel);
           panel.add(lbhrg4);
           
           lbCaramel.setBounds(570,220,200,20);
           lbCaramel.setForeground(Color.white);
           lbCaramel.setFont(new Font("PWChalk", Font.BOLD, 12));
           
           lbhrg4.setBounds(600,240,200,20);
           lbhrg4.setForeground(Color.black);
           lbhrg4.setFont(new Font("PWChalk", Font.BOLD, 12));
          
           panel.add(lbDrinks);
           lbDrinks.setBounds(20,390,100,20);
           lbDrinks.setForeground(Color.black);
           lbDrinks.setFont(new Font("PWChalk", Font.ITALIC, 22));
           
           
           JLabel hot=new JLabel("");
           hot.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("hots.jpg")));
           hot.setBounds(30,420,100,100);
           
           panel.add(hot);
           panel.add(lbHot);
           panel.add(lbhrg5);
           
           lbHot.setBounds(20,530,200,20);
           lbHot.setForeground(Color.white);
           lbHot.setFont(new Font("PWChalk", Font.BOLD, 12));
           
           lbhrg5.setBounds(50,550,200,20);
           lbhrg5.setForeground(Color.black);
           lbhrg5.setFont(new Font("PWChalk", Font.BOLD, 12));
          
           
           JLabel miami=new JLabel("");
           miami.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("miami.jpg")));
           miami.setBounds(200,420,100,100);
           
           panel.add(miami);
           panel.add(lbMiami);
           panel.add(lbhrg6);
           
           lbMiami.setBounds(192,530,200,20);
           lbMiami.setForeground(Color.white);
           lbMiami.setFont(new Font("PWChalk", Font.BOLD, 12));
           
           lbhrg6.setBounds(215,550,200,20);
           lbhrg6.setForeground(Color.black);
           lbhrg6.setFont(new Font("PWChalk", Font.BOLD, 12));
           

           JLabel mango=new JLabel("");
           mango.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("mango.png")));
           mango.setBounds(390,420,100,100);
           
           panel.add(mango);
           panel.add(lbMango);
           panel.add(lbhrg7);
           
           lbMango.setBounds(380,530,200,20);
           lbMango.setForeground(Color.white);
           lbMango.setFont(new Font("PWChalk", Font.BOLD, 12));
           
           lbhrg7.setBounds(405,550,200,20);
           lbhrg7.setForeground(Color.black);
           lbhrg7.setFont(new Font("PWChalk", Font.BOLD, 12));
          
           
           JLabel coffe=new JLabel("");
           coffe.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("late.png")));
           coffe.setBounds(580,420,100,100);
           
           panel.add(coffe);
           panel.add(lbCoffee);
           panel.add(lbhrg8);
           
           lbCoffee.setBounds(583,530,200,20);
           lbCoffee.setFont(new Font("PWChalk", Font.BOLD, 12));
           lbCoffee.setForeground(Color.white);
           
           lbhrg8.setBounds(600,550,200,20);
           lbhrg8.setForeground(Color.black);
           lbhrg8.setFont(new Font("PWChalk", Font.BOLD, 12));
                 
               
           panel.add(pesan);
           pesan.setBounds(550,600,100,40);
           pesan.setForeground(Color.black);
           pesan.setFont(new Font("PWChalk", Font.BOLD, 16));
           
           
           panel.add(keluar);
           keluar.setBounds(700,600,100,40);
           keluar.setForeground(Color.black);
           keluar.setFont(new Font("PWChalk", Font.BOLD, 16));
           
           
           panel.add(gambarBackground);
           gambarBackground.setBounds(0,0,885,700);
    
       }
       
       public void AksiReaksi(){
        pesan.addActionListener(new ActionListener()
          {
            public void actionPerformed(ActionEvent e){
              frame.setVisible(true);
              Order gui = new Order();
            }
          
        });  
        
        keluar.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e){
            System.exit(0);
          }
        }); 
     }
     
   }
   
    
    